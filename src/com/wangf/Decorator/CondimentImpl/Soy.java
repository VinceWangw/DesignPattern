package com.wangf.Decorator.CondimentImpl;

import com.wangf.Decorator.Beverage;
import com.wangf.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage be;

    public Soy(Beverage be) {
        this.be = be;
    }

    @Override
    public String getDescription() {
        return be.getDescription() + " + soy";
    }

    @Override
    public double cost() {
        return be.cost() + .15;
    }

    @Override
    public String toString() {
        return "Soy{" +
                "description='" + this.getDescription() + '\'' + "cost: " + this.cost() + '$' +
                '}';
    }
}
