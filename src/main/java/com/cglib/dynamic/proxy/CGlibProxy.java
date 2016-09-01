package com.cglib.dynamic.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Created by zwshao on 9/1/16.
 */
public class CGlibProxy implements MethodInterceptor {

    private static CGlibProxy instance = new CGlibProxy();

    private CGlibProxy(){

    }

    public static CGlibProxy getInstance(){
        return instance;
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(target, args);
        after();
        return result;
    }

    private void before(){
        System.out.println("*****************");
        System.out.println("Here is before");
        System.out.println("*****************");
    }

    private void after(){
        System.out.println("*****************");
        System.out.println("Here is after");
        System.out.println("*****************");
    }
}
