package com.iRain93.designpattern.proxy;

/**
 * 经纪人
 * @author lu
 * @version 1.0
 */
public class Agent implements Star{
    private Star star;

    public Agent(Star star) {
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("Before singing");
        this.star.sing();
        System.out.println("After singing");
    }
}
