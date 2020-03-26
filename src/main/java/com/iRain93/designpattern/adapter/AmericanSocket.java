package com.iRain93.designpattern.adapter;

/**
 * 美国插座
 * @author lu
 * @version 1.0
 */
public class AmericanSocket implements AmericanSocketI {

    @Override
    public void charging() {
        System.out.println("在美国充电...");
    }
}
