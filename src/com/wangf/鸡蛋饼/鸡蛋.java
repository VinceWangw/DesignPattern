package com.wangf.鸡蛋饼;

public class 鸡蛋 extends 加料{

    public 鸡蛋(食物 鸡蛋饼) {
        super(鸡蛋饼);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "加了一个鸡蛋" + "，";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
