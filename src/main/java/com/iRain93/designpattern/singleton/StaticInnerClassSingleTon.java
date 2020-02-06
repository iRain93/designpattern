package com.iRain93.designpattern.singleton;

/**
 * 静态内部类方式单例模式
 * @author lu
 * @version 1.0
 */
public class StaticInnerClassSingleTon {

    private StaticInnerClassSingleTon() {
    }

    public static StaticInnerClassSingleTon getInstance() {
        return StaticInnerClassSingleTonHolder.instance;
    }

    private static class StaticInnerClassSingleTonHolder {
        private static final StaticInnerClassSingleTon instance = new StaticInnerClassSingleTon();
    }

}
