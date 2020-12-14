package com.wangf.FactoryMethodPattern.PizzaImpl;

import com.wangf.FactoryMethodPattern.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Sauce and Cheese Pizza ";
        dough = "Heavy Crust Dough ";
        sauce = "Marinara";

        topping.add("Grated Reggiano Cheese");
    }
}
