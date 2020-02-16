package com.iRain93.designpattern.singleton;

/**
 * 双重检查懒汉式单例模式
 * @author lu
 * @version 1.0
 */
public class DoubleCheckedLockLazySingleTon {
    /** 1.只有一个实例对象 */
    private static volatile DoubleCheckedLockLazySingleTon instance;
    /** 2.自我实例化 */
    private DoubleCheckedLockLazySingleTon() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }
    /** 3.提供全局访问点 */
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
