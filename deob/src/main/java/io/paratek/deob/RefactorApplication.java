package io.paratek.deob;

import io.paratek.deob.wrap.DClass;
import io.paratek.deob.wrap.DField;
import io.paratek.deob.wrap.DMethod;
import io.paratek.deob.wrap.TriSet;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.tree.*;
import org.json.JSONArray;

import java.io.*;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;

public class RefactorApplication {

    private static final Pattern CLASS_REGEX = Pattern.compile("Ξ➤ ([a-zA-Z0-9]+)\\s+:» ([a-zA-Z]{1,})");
    private static final Pattern FIELD_REGEX = Pattern.compile("Ξ⥰⥰➤\\s([a-zA-Z0-9]+)\\.+([a-zA-Z]{1,})\\.([a-zA-Z]{1,2})\\s.+:\\s(.+)");
    private static final Pattern METHOD_REGEX = Pattern.compile("Ξ⥰⥰➤\\s([a-zA-Z0-9]+)\\.+([a-zA-Z]{1,2})\\.([a-zA-Z]{1,})\\(\\)\\s+:\\s(.+)");
    private static final Pattern NAME_REGEX = Pattern.compile("L([a-z0-9]+);");

    private static final HashMap<String, String> FIELD_UNIQUE_TO_OB = new HashMap<>();
    private static final HashMap<TriSet<String>, String> METHOD_UNIQUE_TO_OB = new HashMap<>();
    private static final HashMap<String, String> CLASS_UNIQUE_TO_OB = new HashMap<>();

    private static final HashMap<String, String> FIELD_OB_TO_UNIQUE = new HashMap<>();
    private static final HashMap<String, String> METHOD_OB_TO_UNIQUE = new HashMap<>();
    private static final HashMap<String, String> CLASS_OB_TO_UNIQUE = new HashMap<>();

    public static void main(String[] args) throws IOException {
        List<String> hooks = readFile("/hooks.txt");
        final HashMap<String, ClassNode> nodeMap = new HashMap<>();
        load(RefactorApplication.class.getResourceAsStream("/thisone.jar"), nodeMap);
        final Map<String, DClass> wrappedHooks = getHooks(hooks);

        for (ClassNode classNode : nodeMap.values()) {
            if (classNode.visibleAnnotations != null) {
                CLASS_UNIQUE_TO_OB.put(classNode.name, (String) classNode.visibleAnnotations.get(0).values.get(1));
                CLASS_OB_TO_UNIQUE.put((String) classNode.visibleAnnotations.get(0).values.get(1), classNode.name);
            }

            for (MethodNode methodNode : classNode.methods) {
                String obdName = null;
                if (methodNode.visibleAnnotations != null) {
                    for (AnnotationNode an : methodNode.visibleAnnotations) {
                        if (an.values.contains("value")) {
                            obdName = (String) an.values.get(1);
                        }
                    }
                }
                if (obdName == null) {
                    obdName = methodNode.name;
                }
                METHOD_OB_TO_UNIQUE.put(obdName, methodNode.name);
                METHOD_UNIQUE_TO_OB.put(new TriSet<>(classNode.name, methodNode.name, methodNode.desc), obdName);
            }

            for (FieldNode fieldNode : classNode.fields) {
                FIELD_UNIQUE_TO_OB.put(fieldNode.name, (String) fieldNode.visibleAnnotations.get(0).values.get(1));
                FIELD_OB_TO_UNIQUE.put((String) fieldNode.visibleAnnotations.get(0).values.get(1), fieldNode.name);
            }
        }

//        for (ClassNode classNode : nodeMap.values()) {
//            String obClassName = CLASS_UNIQUE_TO_OB.get(classNode.name);
//
//            // Fields
//            for (FieldNode fieldNode : classNode.fields) {
//                String obName = FIELD_UNIQUE_TO_OB.get(fieldNode.name);
//                if (wrappedHooks.containsKey(obClassName)) {
//                    final DField f1;
//                    if ((f1 = wrappedHooks.get(obClassName).getFields().get(obName)) != null) {
//                        fieldNode.name = f1.getId();
//                    }
//                }
//                final Matcher matcher = NAME_REGEX.matcher(fieldNode.desc);
//                while (matcher.find()) {
//                    String descName = CLASS_UNIQUE_TO_OB.get(matcher.group(1));
//                    if (wrappedHooks.containsKey(descName)) {
//                        fieldNode.desc = fieldNode.desc.replaceAll(matcher.group(1), wrappedHooks.get(descName).getId());
//                    }
//                }
//            }
//
//            // Methods
//            for (MethodNode methodNode : classNode.methods) {
//                String obName = METHOD_UNIQUE_TO_OB.get(new TriSet<>(classNode.name, methodNode.name, methodNode.desc));
//                if (wrappedHooks.containsKey(obClassName)) {
//                    final DMethod m1;
//                    if ((m1 = wrappedHooks.get(obClassName).getMethods().get(obName)) != null) {
//                        methodNode.name = m1.getId();
//                    }
//                }
//                final Matcher matcher = NAME_REGEX.matcher(methodNode.desc);
//                while (matcher.find()) {
//                    String desc = CLASS_UNIQUE_TO_OB.get(matcher.group(1));
//                    if (wrappedHooks.containsKey(desc)) {
//                        methodNode.desc = methodNode.desc.replaceAll(matcher.group(1), wrappedHooks.get(desc).getId());
//                    }
//                }
//
//                // Field and Method Instructions
//                final ListIterator<AbstractInsnNode> nodeListIterator = methodNode.instructions.iterator();
//                while (nodeListIterator.hasNext()) {
//                    final AbstractInsnNode cur = nodeListIterator.next();
//                    if (cur instanceof FieldInsnNode) {
//                        String ownerOb = CLASS_UNIQUE_TO_OB.get(((FieldInsnNode) cur).owner);
//                        String nameOb = FIELD_UNIQUE_TO_OB.get(((FieldInsnNode) cur).name);
//                        if (wrappedHooks.containsKey(ownerOb)) {
//                            final DField f1;
//                            DClass dClass;
//                            if ((f1 = (dClass = wrappedHooks.get(ownerOb)).getFields().get(nameOb)) != null) {
//                                ((FieldInsnNode) cur).owner = dClass.getId();
//                                ((FieldInsnNode) cur).name = f1.getId();
//                                final Matcher match = NAME_REGEX.matcher(((FieldInsnNode) cur).desc);
//                                while (match.find()) {
//                                    String descName = CLASS_UNIQUE_TO_OB.get(match.group(1));
//                                    if (wrappedHooks.containsKey(descName)) {
//                                        ((FieldInsnNode) cur).desc = ((FieldInsnNode) cur).desc.replaceAll(match.group(1), wrappedHooks.get(descName).getId());
//                                    }
//                                }
//                            } else {
//                                if ((dClass = wrappedHooks.get(ownerOb)) != null) {
//                                    ((FieldInsnNode) cur).owner = dClass.getId();
//                                    final Matcher match = NAME_REGEX.matcher(((FieldInsnNode) cur).desc);
//                                    while (match.find()) {
//                                        String descName = CLASS_UNIQUE_TO_OB.get(match.group(1));
//                                        if (wrappedHooks.containsKey(descName)) {
//                                            ((FieldInsnNode) cur).desc = ((FieldInsnNode) cur).desc.replaceAll(match.group(1), wrappedHooks.get(descName).getId());
//                                        }
//                                    }
//                                }
//                            }
//                        } else {
//                            final Matcher match = NAME_REGEX.matcher(((FieldInsnNode) cur).desc);
//                            while (match.find()) {
//                                String descName = CLASS_UNIQUE_TO_OB.get(match.group(1));
//                                if (wrappedHooks.containsKey(descName)) {
//                                    ((FieldInsnNode) cur).desc = ((FieldInsnNode) cur).desc.replaceAll(match.group(1), wrappedHooks.get(descName).getId());
//                                }
//                            }
//                        }
//                    } else if (cur instanceof MethodInsnNode) {
//                        String ownerOb = CLASS_UNIQUE_TO_OB.get(((MethodInsnNode) cur).owner);
//                        String nameOb = METHOD_UNIQUE_TO_OB.get(new TriSet<>(((MethodInsnNode) cur).owner, ((MethodInsnNode) cur).name, ((MethodInsnNode) cur).desc));
//                        if (wrappedHooks.containsKey(ownerOb)) {
//                            final DMethod m1;
//                            DClass dClass;
//                            if ((m1 = (dClass = wrappedHooks.get(ownerOb)).getMethods().get(nameOb)) != null) {
//                                ((MethodInsnNode) cur).owner = dClass.getId();
//                                ((MethodInsnNode) cur).name = m1.getId();
//                                final Matcher match = NAME_REGEX.matcher(((MethodInsnNode) cur).desc);
//                                while (match.find()) {
//                                    String descName = CLASS_UNIQUE_TO_OB.get(match.group(1));
//                                    if (wrappedHooks.containsKey(descName)) {
//                                        ((MethodInsnNode) cur).desc = ((MethodInsnNode) cur).desc.replaceAll(match.group(1), wrappedHooks.get(descName).getId());
//                                    }
//                                }
//                            } else {
//                                if ((dClass = wrappedHooks.get(ownerOb)) != null) {
//                                    ((MethodInsnNode) cur).owner = dClass.getId();
//                                    final Matcher match = NAME_REGEX.matcher(((MethodInsnNode) cur).desc);
//                                    while (match.find()) {
//                                        String descName = CLASS_UNIQUE_TO_OB.get(match.group(1));
//                                        if (wrappedHooks.containsKey(descName)) {
//                                            ((MethodInsnNode) cur).desc = ((MethodInsnNode) cur).desc.replaceAll(match.group(1), wrappedHooks.get(descName).getId());
//                                        }
//                                    }
//                                }
//                            }
//                        } else {
//                            final Matcher match = NAME_REGEX.matcher(((MethodInsnNode) cur).desc);
//                            while (match.find()) {
//                                String descName = CLASS_UNIQUE_TO_OB.get(match.group(1));
//                                if (wrappedHooks.containsKey(descName)) {
//                                    ((MethodInsnNode) cur).desc = ((MethodInsnNode) cur).desc.replaceAll(match.group(1), wrappedHooks.get(descName).getId());
//                                }
//                            }
//                        }
//                    } else if (cur instanceof TypeInsnNode) {
//                        String obDesc = CLASS_UNIQUE_TO_OB.get(((TypeInsnNode) cur).desc);
//                        if (wrappedHooks.containsKey(obDesc)) {
//                            String oldDesc = ((TypeInsnNode) cur).desc;
//                            ((TypeInsnNode) cur).desc = ((TypeInsnNode) cur).desc.replaceAll(oldDesc, wrappedHooks.get(obDesc).getId());
//                        } else {
//                            final Matcher match = NAME_REGEX.matcher(((TypeInsnNode) cur).desc);
//                            while (match.find()) {
//                                String descName = CLASS_UNIQUE_TO_OB.get(match.group(1));
//                                if (wrappedHooks.containsKey(descName)) {
//                                    ((TypeInsnNode) cur).desc = ((TypeInsnNode) cur).desc.replaceAll(match.group(1), wrappedHooks.get(descName).getId());
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//
//            // Super Class
//            String obSuperName = CLASS_UNIQUE_TO_OB.get(classNode.superName);
//            if (wrappedHooks.containsKey(obSuperName)) {
//                classNode.superName = wrappedHooks.get(obSuperName).getId();
//            }
//
//            // Class Name
//            if (wrappedHooks.containsKey(obClassName)) {
//                classNode.name = wrappedHooks.get(obClassName).getId();
//            }
//
//            List<String> interfaces = classNode.interfaces;
//            for (int i = 0; i < interfaces.size(); i++) {
//                String itf = interfaces.get(i);
//                String obdName = CLASS_UNIQUE_TO_OB.get(itf);
//                if (obdName != null && wrappedHooks.containsKey(obdName)) {
//                    classNode.interfaces.set(i, wrappedHooks.get(obdName).getId());
//                    for (MethodNode mn : classNode.methods) {
//                        String obName = null;
//                        if (mn.visibleAnnotations != null) {
//                            for (AnnotationNode an : mn.visibleAnnotations) {
//                                if (an.values.contains("value")) {
//                                    obName = (String) an.values.get(1);
//                                }
//                            }
//                        }
//                        if (obName != null) {
//                            if (wrappedHooks.get(obdName).getMethods().containsKey(obName)) {
//                                mn.name = wrappedHooks.get(obdName).getMethods().get(obName).getId();
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (classNode.visibleAnnotations != null) {
//                classNode.visibleAnnotations.clear();
//            }
//            for (MethodNode methodNode : classNode.methods) {
//                if (methodNode.visibleAnnotations != null) {
//                    methodNode.visibleAnnotations.clear();
//                }
//            }
//            for (FieldNode fieldNode : classNode.fields) {
//                if (fieldNode.visibleAnnotations != null) {
//                    fieldNode.visibleAnnotations.clear();
//                }
//            }
//
//        }
//
//        dumpJar(nodeMap, "C:\\Users\\Parametric\\Desktop\\deob_renamed_177.jar");
    }

    private static Map<String, DClass> getHooks(List<String> hookData) {
        final HashMap<String, DClass> map = new HashMap<>();
        String lastOwner = "";
        for (String line : hookData) {
            final Matcher classMatcher = CLASS_REGEX.matcher(line);
            final Matcher field = FIELD_REGEX.matcher(line);
            final Matcher method = METHOD_REGEX.matcher(line);
            if (classMatcher.find()) {
                map.put(classMatcher.group(2), new DClass(classMatcher.group(1), classMatcher.group(2)));
                lastOwner = classMatcher.group(2);
            } else if (field.find()) {
                final DClass dClass = map.get(lastOwner);
                dClass.getFields().put(field.group(3), new DField(field.group(3), field.group(1), field.group(4), field.group(2)));
            } else if (method.find()) {
                final DClass dClass = map.get(lastOwner);
                dClass.getMethods().put(method.group(3), new DMethod(method.group(3), method.group(1), method.group(4), method.group(2)));
            }
        }
        return map;
    }

    private static void load(final InputStream inputStream, final HashMap<String, ClassNode> nodeMap) throws IOException {
        final JarInputStream inStream = new JarInputStream(inputStream);
        JarEntry entry;
        while ((entry = inStream.getNextJarEntry()) != null) {
            if (entry.getName().endsWith(".class")) {

                final ClassReader classReader = new ClassReader(inStream);
                final ClassNode classNode = new ClassNode();
                classReader.accept(classNode, 0);

                nodeMap.put(entry.getName().replace(".class", "").replace("/", "."), classNode);
            }

            inStream.closeEntry();
        }

        inStream.close();
    }

    private static List<String> readFile(String path) throws IOException {
        InputStream in = RefactorApplication.class.getResourceAsStream(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<String> out = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            out.add(line);
        }
        reader.close();
        return out;
    }

    public static void dumpJar(final Map<String, ClassNode> classNodeMap, final String fileName) {
        try {
            JarOutputStream out = new JarOutputStream(new FileOutputStream(fileName));
            for (ClassNode cn : classNodeMap.values()) {
                ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                cn.accept(cw);
                out.putNextEntry(new ZipEntry(cn.name + ".class"));
                out.write(cw.toByteArray());
                out.closeEntry();
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
