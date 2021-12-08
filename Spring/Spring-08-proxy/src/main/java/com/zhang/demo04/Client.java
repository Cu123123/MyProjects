package com.zhang.demo04;



public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();

        //Host2 host2 = new Host2();
        //ProxyInvocationHandler pih2 = new ProxyInvocationHandler();
        //pih2.setRent(host2);
        //Rent proxy2 = (Rent) pih2.getProxy();
        //proxy2.rent();


    }
}
