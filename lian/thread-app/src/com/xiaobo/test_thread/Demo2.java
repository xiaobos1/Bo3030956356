package com.xiaobo.test_thread;

public class Demo2 {
    public static void main(String[] args) {
        //创建进程的方法二
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子1进程启动"+i);
                }
            }
        };
        Thread t=new Thread(r);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子2进程启动"+i);
                }
            }
        }).start();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主进程启动"+i);
        }

    }
}

//class MyThread1 implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("子进程启动"+i);
//        }
//    }
//}
