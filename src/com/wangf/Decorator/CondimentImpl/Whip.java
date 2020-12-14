package com.wangf.Decorator.CondimentImpl;

import com.wangf.Decorator.Beverage;
import com.wangf.Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage be;

    public Whip(Beverage be) {
        this.be = be;
    }

    @Override
    public String getDescription() {
        return be.getDescription() + "+ Whip";
    }

    @Override
    public double cost() {
        return be.cost() + .10;
    }

    @Override
    public String toString() {
        return "Whip{" +
                "description='" + this.getDescription() + '\'' + "cost: " + this.cost() + '$' +
                '}';
    }
}
