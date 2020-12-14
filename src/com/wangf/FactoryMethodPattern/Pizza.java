package com.wangf.FactoryMethodPattern;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough; //面团类型
    protected String sauce;
    protected ArrayList topping = new ArrayList();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding source");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < topping.size(); i++) {
            System.out.println("   " + topping.get(i));
        }
    }
    void bake(){
        System.out.println("Bake the pizza for 25 minutes at 350 !");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices !");
    }
    void box(){
        System.out.println("Place pizza in a box!");
    }

    public String getName() {
        return name;
    }
}