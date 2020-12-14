package com.wangf.Adapter;

public class ConcreteDog implements Dog{

    @Override
    public void bark() {
        System.out.println("我是狗，汪汪汪！");
    }
}
