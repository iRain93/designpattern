package com.iRain93.designpattern.singleton;

/**
 * 饿汉式单例模式
 * @author lu
 * @version 1.0
 */
public class HungrySingleTon {

    /** 1.只有一个实例对象 */
    private static final HungrySingleTon instance = new HungrySingleTon();
    /** 2.自我实例化 */
    private HungrySingleTon() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }
    /** 3.提供全局访问点 */
    public static HungrySingleTon getInstance() {
        return instance;
    }
}
