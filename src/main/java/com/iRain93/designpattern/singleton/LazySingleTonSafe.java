package com.iRain93.designpattern.singleton;

/**
 * 懒汉式线程安全单例模式
 * @author lu
 * @version 1.0
 */
public class LazySingleTonSafe {

    private static LazySingleTonSafe instance;

    private LazySingleTonSafe() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }

    public static synchronized LazySingleTonSafe getInstance() {
        if (instance == null) {
            instance = new LazySingleTonSafe();
        }
        return instance;
    }
}
