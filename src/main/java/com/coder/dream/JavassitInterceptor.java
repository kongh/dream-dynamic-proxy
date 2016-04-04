package com.coder.dream;

import javassist.util.proxy.MethodHandler;

import java.lang.reflect.Method;

/**
 * Created by konghang on 16/4/4.
 */
public class JavassitInterceptor implements MethodHandler {

    public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
        System.out.println(" do other thing ... javassit.");
        return self;
    }

}
