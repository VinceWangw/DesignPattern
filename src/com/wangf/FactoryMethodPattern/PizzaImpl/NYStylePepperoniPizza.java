package com.wangf.FactoryMethodPattern.PizzaImpl;

import com.wangf.FactoryMethodPattern.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and Cheese Pizza ";
        dough = "Thin Crust Dough ";
        sauce = "Marinara";

        topping.add("Grated Reggiano Cheese");
    }
}
