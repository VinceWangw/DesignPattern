package com.wangf.Decorator.BeverageImpl;
import com.wangf.Decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public String toString() {
        return "HouseBlend{" +
                "description='" + this.getDescription() + '\'' + "cost: " + this.cost() + '$' +
                '}';
    }
}
