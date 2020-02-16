package com.iRain93.designpattern.singleton;

/**
 * 静态内部类方式单例模式
 * @author lu
 * @version 1.0
 */
public class StaticInnerClassSingleTon {

    /** 2.自我实例化 */
    private StaticInnerClassSingleTon() { }
    /** 3.提供全局访问点 */
    public static StaticInnerClassSingleTon getInstance() {
        return StaticInnerClassSingleTonHolder.instance;
    }
    /** 1.只有一个实例对象 */
    private static class StaticInnerClassSingleTonHolder {
        private static final StaticInnerClassSingleTon instance = new StaticInnerClassSingleTon();
    }
}
