package com.xiaobo.test1_thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() +"输出："+i);
        }
    }
}
