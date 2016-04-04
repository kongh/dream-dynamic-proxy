package com.coder.dream;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by konghang on 16/4/4.
 */
public class JdkProxyHandler implements InvocationHandler{

    //这个就是我们要代码的真实对象
    private Object subject;

    public JdkProxyHandler(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do other something ... ");
        return method.invoke(subject,args);
    }

}
