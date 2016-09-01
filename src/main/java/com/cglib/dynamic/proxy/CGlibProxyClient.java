package com.cglib.dynamic.proxy;

import com.dynamic.proxy.GreetingImpl;

/**
 * Created by zwshao on 9/1/16.
 */
public class CGlibProxyClient {
    public static void main(String[] args){
        GreetingImpl greeting = CGlibProxy.getInstance().getProxy(GreetingImpl.class);
        greeting.sayHello();
    }
}
