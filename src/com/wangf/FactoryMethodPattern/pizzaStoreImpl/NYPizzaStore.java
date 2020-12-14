package com.wangf.FactoryMethodPattern.pizzaStoreImpl;

import com.wangf.FactoryMethodPattern.Pizza;
import com.wangf.FactoryMethodPattern.PizzaImpl.*;
import com.wangf.FactoryMethodPattern.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza creatPizza(String type) {

        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (type.equals("clam")){
            return new NYStyleClamPizza();
        }else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else {
            return new NYStyleVeggiePizza();
        }
    }


}
