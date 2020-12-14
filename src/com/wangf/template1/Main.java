package com.wangf.template1;

public class Main {
    public static void main(String[] args) {

        ICourse dpc = new DesignPattern();
        dpc.makeCouse();

        System.out.println("===============");

        ICourse fec = new FECourse();
        fec.makeCouse();
    }
}
