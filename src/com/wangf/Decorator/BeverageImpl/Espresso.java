package com.wangf.Decorator.BeverageImpl;
import com.wangf.Decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "description='" + this.getDescription() + '\'' + "cost: " + this.cost() + '$' +
                 '}';
    }
}
