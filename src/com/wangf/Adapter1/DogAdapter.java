package com.wangf.Adapter1;

public class DogAdapter implements Cat{
    Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        dog.bark();
    }
}
