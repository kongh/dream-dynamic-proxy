package com.coder.dream;

import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

/**
 * Created by konghang on 16/4/4.
 */
public class JavassistTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        RealSubject rs = new RealSubject();
        JavassitInterceptor interceptor = new JavassitInterceptor(rs);
        ProxyFactory factory = new ProxyFactory();
        factory.setInterfaces(RealSubject.class.getInterfaces());
        Class<?> proxyClass = factory.createClass();
        Interface proxy = (Interface)proxyClass.newInstance();
        ((ProxyObject)proxy).setHandler(interceptor);
        proxy.doSomeThing();
    }
}
