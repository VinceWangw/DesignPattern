package com.wangf.Movie;


//题目说了不同的打折策略
//第一步，写一个所有打折策略的抽象类，给具体策略继承
public abstract class Discount {

    public double price;

    public double getPrice(){
        System.out.println("原价。");
        return price;
    }
}
