package com.zhang.demo04;

import com.zhang.demo01.Rent;

public class Host2 implements Rent {
    @Override
    public void rent() {
        System.out.println("李四要出租房子");
    }
}
