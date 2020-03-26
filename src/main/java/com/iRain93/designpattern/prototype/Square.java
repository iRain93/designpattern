package com.iRain93.designpattern.prototype;

/**
 * 正方形
 * @author lu
 * @version 1.0
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}