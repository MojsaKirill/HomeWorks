package com.kirill;

public class TowerStep implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        return new Tower("Башня");
    }
}
