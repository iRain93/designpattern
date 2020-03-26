package com.iRain93.designpattern.prototype;

/**
 * 长方形
 *
 * @author lu
 * @version 1.0
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}