package com.wangf.FactoryMethodPattern;

public abstract class  PizzaStore {

    protected  abstract Pizza creatPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
