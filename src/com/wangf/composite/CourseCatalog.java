package com.wangf.composite;

import java.util.ArrayList;
import java.util.List;

//课程目录类
public class CourseCatalog extends CatalogComponent {
    //目录里有很多课程，课程又是目录组件
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    //课程目录类没有课程的名称和价格，所以不重写那两个方法
    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            System.out.print(" ");
            item.print();
        }
    }
}
