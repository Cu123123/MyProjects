package com.zhang.demo04;

import com.zhang.demo01.Rent;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("张三 要出租房子");
    }
}
