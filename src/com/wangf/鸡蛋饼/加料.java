package com.wangf.鸡蛋饼;

public abstract class 加料 extends 食物{
    private 食物 鸡蛋饼;

    public 加料(食物 鸡蛋饼) {
        this.鸡蛋饼 = 鸡蛋饼;
    }

    @Override
    public String getDescription() {
        return 鸡蛋饼.getDescription();
    }

    @Override
    public int cost() {
        return 鸡蛋饼.cost();
    }
}
