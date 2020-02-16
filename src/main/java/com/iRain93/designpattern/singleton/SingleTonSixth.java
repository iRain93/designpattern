package com.iRain93.designpattern.singleton;

/**
 * 枚举类型实现单例模式
 * @author lu
 * @version 1.0
 */
public class SingleTonSixth {

    private SingleTonSixth(){ }

    public static SingleTonSixth getInstance(){
        return SingleTonEnum.INSTANCE.getInstance();
    }

    private static enum SingleTonEnum{
        INSTANCE;
        private  SingleTonSixth singleTonSixth;
        private  SingleTonEnum(){
            singleTonSixth=new SingleTonSixth();
        }
        private  SingleTonSixth getInstance(){
            return singleTonSixth;
        }
    }
}
