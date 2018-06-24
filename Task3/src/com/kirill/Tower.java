package com.kirill;

public class Tower implements IProductPart {
    private String name;

    public Tower(String name) {
        System.out.println("Создан объект башня");
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
