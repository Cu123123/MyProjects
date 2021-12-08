package com.zhang.servlet;

public class SingleDemo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.message();
    }
}
