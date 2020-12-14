package com.wangf.Adapter;

public class ConcreteCat implements Cat{

    @Override
    public void catchMouse() {
        System.out.println("我是猫，捉老鼠！");
    }
}
