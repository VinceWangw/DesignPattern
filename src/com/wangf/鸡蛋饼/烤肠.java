package com.wangf.鸡蛋饼;

public class 烤肠 extends 加料{

    public 烤肠(食物 鸡蛋饼) {
        super(鸡蛋饼);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "加了一个烤肠" + "，";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
