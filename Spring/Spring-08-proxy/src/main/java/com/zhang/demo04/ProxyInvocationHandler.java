package com.zhang.demo04;

import com.zhang.demo01.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成的到代理对象
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this );
    }

    //处理代理类，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制来实现
        seeHouse();
        Object result = method.invoke(rent, args);
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带看房子");
    }
}
