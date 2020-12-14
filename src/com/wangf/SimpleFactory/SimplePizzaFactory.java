package com.wangf.SimpleFactory;

import com.wangf.SimpleFactory.PizzaImpl.CheesePizza;
import com.wangf.SimpleFactory.PizzaImpl.PepperoniPizza;
import com.wangf.SimpleFactory.PizzaImpl.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza creatPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
