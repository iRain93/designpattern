package com.iRain93.designpattern.singleton;

/**
 * 饿汉式单例模式
 * @author lu
 * @version 1.0
 */
public class HungrySingleTon {

    private static final HungrySingleTon instance = new HungrySingleTon();

    private HungrySingleTon() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }

    public HungrySingleTon getInstance() {
        return instance;
    }

}
