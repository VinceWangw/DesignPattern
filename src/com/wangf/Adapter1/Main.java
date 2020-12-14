package com.wangf.Adapter1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new ConcreteDog();

        DogAdapter dogAdapter = new DogAdapter(dog);

        dogAdapter.catchMouse();
    }

}
