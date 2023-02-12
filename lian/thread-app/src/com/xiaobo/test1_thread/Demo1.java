package com.xiaobo.test1_thread;

public class Demo1 {
    public static void main(String[] args) {
        Account ac=new Account("ID123",100000);

        //创建俩个线程对象
        new DrawThread(ac,"小明").start();
        new DrawThread(ac,"小红").start();
    }
}
