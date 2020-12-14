package com.wangf.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = store.orderPizza("cheese");


    }
}
