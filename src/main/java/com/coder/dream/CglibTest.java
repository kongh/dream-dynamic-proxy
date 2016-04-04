package com.coder.dream;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by konghang on 16/4/4.
 */
public class CglibTest {

    public static void main(String[] args) {
        RealSubject rs = new RealSubject();
        Enhancer enhancer = new Enhancer();
        CglibInterceptor interceptor = new CglibInterceptor(rs);
        enhancer.setCallback(interceptor);
        enhancer.setInterfaces(rs.getClass().getInterfaces());
        Interface proxy = (Interface) enhancer.create();
        proxy.doSomeThing();
    }
}
