package com.iRain93.designpattern.singleton;

/**
 * 懒汉式线程不安全单例模式
 * @author lu
 * @version 1.0
 */
public class LazySingleTon {
    private static LazySingleTon instance;

    private LazySingleTon() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }

    public static LazySingleTon getInstance() {
        if (instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }
}
