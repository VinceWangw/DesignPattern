package com.wangf.鸡蛋饼;

public abstract class 食物 {
    protected abstract String getDescription();
    protected abstract int cost();


    @Override
    public String toString() {
        return "你买的是：" + this.getDescription() +"价格为："  + this.cost() + "元";
    }
}
