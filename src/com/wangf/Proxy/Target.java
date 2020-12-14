package com.wangf.Proxy;

class Target{
    public void print() {
        System.out.println("target");
    }
}

class Proxy extends Target{
    @Override
    public void print() {
        System.out.println("proxy");
        super.print();
    }
}

class test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.print();
    }
}
