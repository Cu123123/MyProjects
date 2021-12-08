package com.itheima_06;

public class SellTicketDemo2 {
    public static void main(String[] args) {
        SellTicket2 sellTicket2 = new SellTicket2();
        Thread t1 = new Thread(sellTicket2,"窗口1");
        Thread t2 = new Thread(sellTicket2,"窗口2");
        Thread t3 = new Thread(sellTicket2,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
