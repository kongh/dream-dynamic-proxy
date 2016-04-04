package com.coder.dream;

import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;

/**
 * Created by konghang on 16/4/4.
 */
public class JavassitInterceptor implements MethodHandler {

    //真实主题
    private Object subject;

    public JavassitInterceptor(Object subject) {
        this.subject = subject;
    }

    public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
        System.out.println(" do other thing ... javassit.");
        return thisMethod.invoke(subject,args);
    }

}
