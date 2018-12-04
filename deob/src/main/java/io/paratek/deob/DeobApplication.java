package io.paratek.deob;

import com.google.common.base.Stopwatch;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.deob.Deobfuscator;
import net.runelite.deob.deobfuscators.*;
import net.runelite.deob.deobfuscators.arithmetic.ModArith;
import net.runelite.deob.deobfuscators.arithmetic.MultiplicationDeobfuscator;
import net.runelite.deob.deobfuscators.arithmetic.MultiplyOneDeobfuscator;
import net.runelite.deob.deobfuscators.arithmetic.MultiplyZeroDeobfuscator;
import net.runelite.deob.deobfuscators.cfg.ControlFlowDeobfuscator;
import net.runelite.deob.deobfuscators.constparam.ConstantParameter;
import net.runelite.deob.deobfuscators.exprargorder.ExprArgOrder;
import net.runelite.deob.deobfuscators.menuaction.MenuActionDeobfuscator;
import net.runelite.deob.deobfuscators.transformers.ClientErrorTransformer;
import net.runelite.deob.deobfuscators.transformers.GetPathTransformer;
import net.runelite.deob.deobfuscators.transformers.MaxMemoryTransformer;
import net.runelite.deob.deobfuscators.transformers.OpcodesTransformer;
import net.runelite.deob.util.JarUtil;

import java.io.File;
import java.io.IOException;

public class DeobApplication {

    public static void main(String[] args) {
        final String input = args[0], output = args[1];

        ClassGroup group = null;
            try {
            group = JarUtil.loadJar(new File(input));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (group != null) {
            run(group, new RuntimeExceptions());
            run(group, new ControlFlowDeobfuscator());
            run(group, new RenameUnique());
            run(group, new UnreachedCode());
            run(group, new UnusedMethods());
            run(group, new IllegalStateExceptions());
            run(group, new ConstantParameter());
            run(group, new UnreachedCode());
            run(group, new UnusedMethods());
            run(group, new UnusedParameters());
            run(group, new UnusedFields());
            run(group, new FieldInliner());
            run(group, new Order());
            run(group, new UnusedClass());
            runMath(group);
            run(group, new ExprArgOrder());
            run(group, new Lvt());
            run(group, new CastNull());
            new OpcodesTransformer().transform(group);
            run(group, new MenuActionDeobfuscator());
            new GetPathTransformer().transform(group);
            new ClientErrorTransformer().transform(group);
            new MaxMemoryTransformer().transform(group);

//            for (ClassFile cf : group.getClasses()) {
//                cf.getAnnotations().clearAnnotations();
//                for (Method m : cf.getMethods()) {
//                    m.getAnnotations().clearAnnotations();
//                }
//                for (Field f : cf.getFields()) {
//                    f.getAnnotations().clearAnnotations();
//                }
//            }

            try {
                JarUtil.saveJar(group, new File(output));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private static void runMath(ClassGroup group) {
        ModArith mod = new ModArith();
        mod.run(group);
        int last = -1, cur;
        while ((cur = mod.runOnce()) > 0) {
            new MultiplicationDeobfuscator().run(group);
            new MultiplyOneDeobfuscator(true).run(group);
            new MultiplyZeroDeobfuscator().run(group);
            if (last == cur) {
                break;
            }

            last = cur;
        }
        new MultiplyOneDeobfuscator(false).run(group);

        mod.annotateEncryption();
    }

    private static void run(ClassGroup group, Deobfuscator deob) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        deob.run(group);
        stopwatch.stop();
    }

}
