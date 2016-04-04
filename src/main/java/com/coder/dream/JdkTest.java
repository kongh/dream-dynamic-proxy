package com.coder.dream;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by konghang on 16/4/4.
 */
public class JdkTest {

    public static void main(String[] args) {
        RealSubject rs = new RealSubject();
        InvocationHandler handler = new JdkProxyHandler(rs);
        Interface proxy = (Interface) Proxy.newProxyInstance(handler.getClass().getClassLoader(), rs.getClass().getInterfaces(), handler);
        proxy.doSomeThing();
    }
}
