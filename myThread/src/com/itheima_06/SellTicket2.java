package com.itheima_06;

public class SellTicket2 implements Runnable{
    int i = 100 ;
    @Override
    public void run() {

        for ( i = 1 ;i <= 100 ;i++){

            System.out.println(Thread.currentThread().getName()+"正在出售第"+i+"张票");
        }
    }
}
