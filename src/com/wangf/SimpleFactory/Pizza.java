package com.wangf.SimpleFactory;

public abstract class Pizza {

    void prepare(){
        System.out.println("prepare a pizze!");
    }
    void bake(){
        System.out.println("bake a pizza!");
    }
    void cut(){
        System.out.println("cut a pizza!");
    }
    void box(){
        System.out.println("put in a box!");
    }



}