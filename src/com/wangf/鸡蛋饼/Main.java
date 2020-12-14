package com.wangf.鸡蛋饼;

public class Main {
    public static void main(String[] args) {

        食物 鸡蛋饼v0 = new 饼();
        System.out.println(鸡蛋饼v0);

        食物 鸡蛋饼v1 = new 烤肠(鸡蛋饼v0);
        System.out.println(鸡蛋饼v1);

        食物 鸡蛋饼v2 = new 鸡蛋(鸡蛋饼v1);
        System.out.println(鸡蛋饼v2);

        食物 鸡蛋饼v3 = new 烤肠(鸡蛋饼v2);
        System.out.println(鸡蛋饼v3);

        食物 鸡蛋饼v4 = new 生菜(鸡蛋饼v3);
        System.out.println(鸡蛋饼v4);
    }
}
