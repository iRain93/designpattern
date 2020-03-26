package com.iRain93.designpattern.adapter;

/**
 * 转换器
 * @author lu
 * @version 1.0
 */
public class ConverterAdapter  implements ChinaSocketI {

    private AmericanSocket socket;
    ConverterAdapter(AmericanSocket socket) {
        this.socket = socket;
    }

    public void charging() {
        if (socket != null) {
            socket.charging();
        }
    }
}
