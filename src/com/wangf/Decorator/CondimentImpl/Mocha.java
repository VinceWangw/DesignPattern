package com.wangf.Decorator.CondimentImpl;

import com.wangf.Decorator.Beverage;
import com.wangf.Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage be;

    public Mocha(Beverage be) {
        this.be = be;
    }

    @Override
    public String getDescription() {
        return be.getDescription() + " + Mocha";
    }

    @Override
    public double cost() {
        return be.cost() + .20;
    }

    @Override
    public String toString() {
        return "Mocha{" +
                "description='" + this.getDescription() + '\'' + "cost: " + this.cost() + '$' +
                '}';
    }
}
