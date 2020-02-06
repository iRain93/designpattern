package com.iRain93.designpattern.singleton;

/**
 * 双重检查懒汉式单例模式
 * @author lu
 * @version 1.0
 */
public class DoubleCheckedLockLazySingleTon {
    private static volatile DoubleCheckedLockLazySingleTon instance;

    private DoubleCheckedLockLazySingleTon() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }

    public static DoubleCheckedLockLazySingleTon getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockLazySingleTon.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockLazySingleTon();
                }
            }
        }
        return instance;
    }
}
