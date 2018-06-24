package com.kirill;

public class BodyStep implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new Body("Корпус");
    }
}
