package com.coder.dream;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by konghang on 16/4/4.
 */
public class CglibInterceptor implements MethodInterceptor{

    private Object subject;

    public CglibInterceptor(Object subject) {
        this.subject = subject;
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(" do other thing ... cglib..");
        return proxy.invoke(subject,args);
    }
}
