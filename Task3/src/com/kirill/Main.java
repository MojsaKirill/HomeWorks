package com.kirill;

public class Main {
    public static void main(String[] args) {
        IAssemblyLineImpl assemblyLine = new IAssemblyLineImpl(new BodyStep(), new EngineStep(), new TowerStep());

        Tank tank = (Tank)assemblyLine.assembleProduct(new Tank());
        System.out.println("Сборка завершена");
    }
}
