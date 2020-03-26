package com.iRain93.designpattern.prototype;

/**
 * 圆形
 * @author lu
 * @version 1.0
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
