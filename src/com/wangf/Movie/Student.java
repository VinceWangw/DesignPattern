package com.wangf.Movie;

public class Student extends Discount{
    @Override
    public double getPrice() {
        System.out.println("学生打8折");
        return super.getPrice() * 0.8;
    }
}
