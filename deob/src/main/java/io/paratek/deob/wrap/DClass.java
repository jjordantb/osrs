package io.paratek.deob.wrap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DClass {

    private final HashMap<String, DField> fields = new HashMap<>();
    private final HashMap<String, DMethod> methods = new HashMap<>();

    private final String name, id;

    public DClass(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public HashMap<String, DField> getFields() {
        return fields;
    }

    public HashMap<String, DMethod> getMethods() {
        return methods;
    }

}
