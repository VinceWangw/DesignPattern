package com.wangf.鸡蛋饼;

public class 饼 extends 食物{


    @Override
    protected String getDescription() {
        return "鸡蛋饼";
    }

    @Override
    protected int cost() {
        return 5;
    }


}
