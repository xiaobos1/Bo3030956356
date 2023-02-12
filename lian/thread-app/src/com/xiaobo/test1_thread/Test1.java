package com.xiaobo.test1_thread;

public class Test1 {
    public static void main(String[] args) {
        Thread t1=new MyThread();
        t1.setName("1号");
        t1.start();

        Thread t2=new MyThread();
        t2.setName("2号");
        t2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+i);
        }

    }
}
