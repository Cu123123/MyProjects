package com.zhang.demo01;
//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("张三要出租房子");
    }
}
