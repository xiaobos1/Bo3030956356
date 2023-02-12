package com.xiaobo.test_thread;

import com.xiaobo.test1_thread.MyThread;

public class Demo {
    public static void main(String[] args) {
        Thread t=new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主进程启动 "+i);
        }
    }
}
