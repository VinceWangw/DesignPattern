package com.wangf.FactoryMethodPattern.PizzaImpl;

import com.wangf.FactoryMethodPattern.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza ";
        dough = "Thin Crust Dough ";
        sauce = "Marinara";

        topping.add("Grated Reggiano Cheese");
    }
}
