package com.kirill;

public class Body implements IProductPart {
    private String name;

    public Body (String name) {
        System.out.println("Создан объект корпус");
        this.name=name;
    }

    public String toString() {
        return name;
    }
}
