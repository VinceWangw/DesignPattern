package com.wangf.鸡蛋饼;

public class 生菜 extends 加料 {
    public 生菜(食物 鸡蛋饼) {
        super(鸡蛋饼);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "加生菜，";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
