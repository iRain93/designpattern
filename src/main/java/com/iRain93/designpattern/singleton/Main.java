package com.iRain93.designpattern.singleton;

/**
 * 测试类
 * @author lu
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        LazySingleTonSafe ton1 = LazySingleTonSafe.getInstance();
        System.out.println(ton1);
        LazySingleTonSafe ton2 = LazySingleTonSafe.getInstance();
        System.out.println(ton2);
        System.out.println(ton1 == ton2);
        System.out.println(ton2.equals(ton1));
    }
}
