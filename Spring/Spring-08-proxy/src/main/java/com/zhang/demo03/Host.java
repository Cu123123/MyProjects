package com.zhang.demo03;

import com.zhang.demo01.Rent;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
