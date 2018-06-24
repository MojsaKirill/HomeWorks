package com.kirill;

public class Tank implements IProduct {
    private IProductPart body;
    private IProductPart engine;
    private IProductPart tower;

    @Override
    public void installFirstPart(IProductPart p) {
        this.body = p;
        System.out.println(p.toString() + " установлен(а)");
    }

    @Override
    public void installSecondPart(IProductPart p) {
        this.engine = p;
        System.out.println(p.toString() + " установлен(а)");
    }

    @Override
    public void installThirdPart(IProductPart p) {
        this.tower = p;
        System.out.println(p.toString() + " установлен(а)");
    }
}
