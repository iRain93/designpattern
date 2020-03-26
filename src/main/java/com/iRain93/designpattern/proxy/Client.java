package com.iRain93.designpattern.proxy;

/**
 * 舞台
 * @author lu
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent(new SelenaGomez());
        agent.sing();
    }
}
