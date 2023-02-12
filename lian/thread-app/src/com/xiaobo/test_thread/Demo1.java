package com.xiaobo.test_thread;

public class Demo1 {
    public static void main(String[] args) {
        //创建进程的方法二
        Runnable r = new MyThread1();
        Thread t=new Thread(r);

        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主进程启动"+i);
        }

    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子进程启动"+i);
        }
    }
}
