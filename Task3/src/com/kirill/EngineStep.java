package com.kirill;

public class EngineStep implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new Engine("Двигатель");
    }
}
