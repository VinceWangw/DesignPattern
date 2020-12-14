package com.wangf.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("设计模式：");
        ACourse dpc = new DesignPannternCourse();
        dpc.makeCourse();

        System.out.println("======================");

        System.out.println("前端：");
        ACourse fec = new FECourse();
        fec.makeCourse();
    }
}
