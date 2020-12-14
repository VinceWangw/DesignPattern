package com.wangf.Movie;

public class VIP extends Discount{

    @Override
    public double getPrice() {
        System.out.println("会员打折");
        return super.getPrice() * 0.5;
    }
}
