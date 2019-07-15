package com.lesliefish;

public class OtherClass {
    private String name;
    private String type;

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        System.out.println("type : " + type);
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
