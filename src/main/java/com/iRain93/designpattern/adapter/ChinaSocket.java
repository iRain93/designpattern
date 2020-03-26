package com.iRain93.designpattern.adapter;

/**
 * 用一句话描述次类
 *
 * @author lu
 * @version 1.0
 */
public class ChinaSocket implements ChinaSocketI {
    @Override
    public void charging() {
        System.out.println("在中国充电...");
    }
}
