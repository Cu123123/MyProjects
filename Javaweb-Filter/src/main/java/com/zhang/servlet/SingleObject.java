package com.zhang.servlet;

public class SingleObject {
    private  static SingleObject instance = new SingleObject();
    private SingleObject(){}

//    public static SingleObject getInstance(){
//        return instance;
//    }


    public static SingleObject getInstance() {
        return instance;
    }

    public void message(){
        System.out.println("hello");
    }
}
