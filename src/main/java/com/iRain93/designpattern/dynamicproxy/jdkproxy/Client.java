package com.iRain93.designpattern.dynamicproxy.jdkproxy;

import com.iRain93.designpattern.dynamicproxy.SelenaGomez;
import com.iRain93.designpattern.dynamicproxy.Star;

/**
 * 舞台
 * @author lu
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Star proxy = (Star) new JdkProxy().getProxy(new SelenaGomez());
        proxy.sing();
    }
}
