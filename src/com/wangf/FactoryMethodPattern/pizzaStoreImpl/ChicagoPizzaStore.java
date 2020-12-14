package com.wangf.FactoryMethodPattern.pizzaStoreImpl;

import com.wangf.FactoryMethodPattern.Pizza;
import com.wangf.FactoryMethodPattern.PizzaImpl.*;
import com.wangf.FactoryMethodPattern.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza creatPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (type.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else {
            return new ChicagoStyleCheesePizza();
        }

    }
}
