package com.kirill;

public class IAssemblyLineImpl implements IAssemblyLine {
    ILineStep bodyStep;
    ILineStep engineStep;
    ILineStep towerStep;

    public IAssemblyLineImpl(ILineStep bodyStep, ILineStep engineStep, ILineStep towerStep) {
        this.bodyStep = bodyStep;
        this.engineStep = engineStep;
        this.towerStep = towerStep;
    }

    @Override
    public IProduct assembleProduct(IProduct p) {
        p.installFirstPart(bodyStep.buildProductPart());
        p.installSecondPart(engineStep.buildProductPart());
        p.installThirdPart(towerStep.buildProductPart());
        return p;
    }
}
