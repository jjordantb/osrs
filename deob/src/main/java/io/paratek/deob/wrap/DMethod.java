package io.paratek.deob.wrap;

public class DMethod {

    private final String name, id, desc, owner;

    public DMethod(String name, String id, String desc, String owner) {
        this.name = name;
        this.id = id;
        this.desc = desc;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public String getOwner() {
        return owner;
    }

}
