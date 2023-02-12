package com.xiaobo.test_thread;

import java.util.concurrent.*;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        //创建线程池对象
      ExecutorService pool=Executors.newFixedThreadPool(3);

      //
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());

    }
}
