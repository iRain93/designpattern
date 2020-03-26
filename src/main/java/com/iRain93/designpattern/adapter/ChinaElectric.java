package com.iRain93.designpattern.adapter;

/**
 * 中国电器
 * @author lu
 * @version 1.0
 */
public class ChinaElectric {
    public static void main(String[] args) {
        ConverterAdapter adapter = new ConverterAdapter(new AmericanSocket());
        adapter.charging();
    }
}
