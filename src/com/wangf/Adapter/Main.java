package com.wangf.Adapter;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Adapter(new ConcreteDog());
        Dog dog = new Adapter(new ConcreteCat());

        new Adapter(new ConcreteDog()).catchMouse();

        cat.catchMouse();
        dog.bark();

    }
}
