package com.iRain93.designpattern.singleton;

/**
 * 用一句话描述次类
 *
 * @author lu
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        StaticInnerClassSingleTon ton1 = StaticInnerClassSingleTon.getInstance();
        StaticInnerClassSingleTon ton2 = StaticInnerClassSingleTon.getInstance();
        System.out.println(ton1 == ton2);
    }
}
