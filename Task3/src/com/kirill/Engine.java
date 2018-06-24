package com.kirill;

public class Engine implements IProductPart {
    private String name;

    Engine (String  name) {
        System.out.println("Создан объект двигатель");
        this.name=name;
    }

    public String toString() {
        return name;
    }
}
