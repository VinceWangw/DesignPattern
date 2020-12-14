package com.wangf.Decorator;
import com.wangf.Decorator.BeverageImpl.Espresso;
import com.wangf.Decorator.BeverageImpl.HouseBlend;
import com.wangf.Decorator.CondimentImpl.Mocha;
import com.wangf.Decorator.CondimentImpl.Soy;
import com.wangf.Decorator.CondimentImpl.Whip;

public class Main {

    public static void main(String[] args) {

        Beverage be1 = new Espresso();
        System.out.println(be1);

        Beverage be2 = new HouseBlend();
        be2 = new Soy(be2);
        be2 = new Mocha(be2);
        be2 = new Whip(be2);
        System.out.println(be2);

        System.out.println(new Whip(new Soy(new Mocha(new Espresso()))));

    }
}
