package com.iRain93.designpattern.template;

/**
 * 性感美女A
 * @author lu
 * @version 1.0
 */
public class SexyBeautyA extends SexyBeauty {

    @Override
    void breakfast() {
        System.out.println("早餐：香蕉 + 牛奶");
    }

    @Override
    void lunch() {
        System.out.println("午餐：烤鸭 + 米饭");
    }

    @Override
    void dinner() {
        System.out.println("晚餐：水果");
    }
}
