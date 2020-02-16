package com.iRain93.designpattern.singleton;

/**
 * 测试类
 * @author lu
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        StaticInnerClassSingleTon  ton1 = StaticInnerClassSingleTon .getInstance();
        System.out.println(ton1);
        StaticInnerClassSingleTon  ton2 = StaticInnerClassSingleTon .getInstance();
        System.out.println(ton2);
        System.out.println(ton1 == ton2);
        System.out.println(ton2.equals(ton1));
    }
}
