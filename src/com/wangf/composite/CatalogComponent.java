package com.wangf.composite;

//目录组件，抽象类，里边有默认实现，交给子类来决定是否需要重写
//课程目录和课程本身两个层次对象操作并不完全一样，但是又有一样的，在父类把所有方法都写完，交由子类选择性地重写
public abstract class CatalogComponent {
    //肯定是add自己本身
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }
    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添删除操作");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    //如果组件是课程，那就打印课程，如果组件是目录，那就打印课程目录
    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
