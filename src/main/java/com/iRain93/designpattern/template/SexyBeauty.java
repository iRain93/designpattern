package com.iRain93.designpattern.template;

/**
 * 抽象美女形象
 * @author lu
 * @version 1.0
 */
public abstract class SexyBeauty {
    /**
     * 早餐
     * @return void
     */
    abstract void  breakfast();

    /**
     * 午餐
     * @return void
     */
    abstract void lunch();

    /**
     * 晚餐
     * @return void
     */
    abstract void dinner();

    /**
     * 一天伙食
     * @return void
     */
    public  void oneDay(){
        this.breakfast();
        this.lunch();
        this.dinner();
    }
}

