package com.wangf.composite;

//课程类
public class Course extends CatalogComponent {

    private String name;
    private double price;


    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //选择性地重写方法，add和remove不行，因为课程本身已经是叶子节点了
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:" + this.name + " " + this.price);
    }
}

