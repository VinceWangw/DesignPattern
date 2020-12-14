package com.wangf.Adapter;

public class Adapter implements Cat, Dog{

    Cat cat;
    Dog dog;

    public Adapter(Cat cat) {
        this.cat = cat;
    }

    public Adapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        dog.bark();
    }

    @Override
    public void bark() {
        cat.catchMouse();
    }
}
