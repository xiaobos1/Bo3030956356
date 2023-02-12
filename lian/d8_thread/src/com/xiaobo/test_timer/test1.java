package com.xiaobo.test_timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 Timer定时器的使用和了解
 */
public class test1 {
    public static void main(String[] args) {
        Timer t=new Timer();
        //调用定时任务
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"说了声吊毛");
            }
        },3000,2000);
    }
}
