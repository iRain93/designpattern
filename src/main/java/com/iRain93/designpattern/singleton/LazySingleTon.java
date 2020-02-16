package com.iRain93.designpattern.singleton;

/**
 * 懒汉式线程不安全单例模式
 * @author lu
 * @version 1.0
 */
public class LazySingleTon {

    /** 1.只有一个实例对象 */
    private static LazySingleTon instance;

    /** 2.自我实例化 */
    private LazySingleTon() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }
    /** 3.提供全局访问点 */
    public static LazySingleTon getInstance() {
        if (instance == null) {
            instance = new LazySingleTon();
        }
        return instance;
    }
}
