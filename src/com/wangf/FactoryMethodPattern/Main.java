package com.wangf.FactoryMethodPattern;

import com.wangf.FactoryMethodPattern.pizzaStoreImpl.ChicagoPizzaStore;
import com.wangf.FactoryMethodPattern.pizzaStoreImpl.NYPizzaStore;

public class Main {
    public static void main(String[] args) {

        PizzaStore storeNY = new NYPizzaStore();
        PizzaStore storeCH = new ChicagoPizzaStore();

        Pizza pizza = storeNY.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = storeCH.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
