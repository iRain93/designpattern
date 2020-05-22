package com.iRain93.designpattern.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理（实现调用处理程序接口）
 * @author lu
 * @version 1.0
 */
public class JdkProxy implements InvocationHandler {

    private Object target;
    public Object getProxy(Object object){
        this.target = object;
        Object proxy = Proxy.newProxyInstance(object.getClass().getClassLoader(),
                    object.getClass().getInterfaces(),this);
        return proxy;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target,args);
    }
}
