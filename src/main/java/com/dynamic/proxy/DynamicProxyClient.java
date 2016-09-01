package com.dynamic.proxy;

/**
 * Created by zwshao on 9/1/16.
 */
public class DynamicProxyClient {

    public static void main(String[] args){
        Greeting greeting = new DynamicProxy(new GreetingImpl()).getProxy();

        greeting.sayHello();
    }
}
