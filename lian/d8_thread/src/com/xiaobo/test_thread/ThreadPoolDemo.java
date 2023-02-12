package com.xiaobo.test_thread;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService pool=new ThreadPoolExecutor(3,5,5,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //给任务线程池进行处理
        Runnable ta=new MyRunnable();
        pool.execute(ta);
        pool.execute(ta);
        pool.execute(ta);
        pool.execute(ta);
        pool.execute(ta);

    }
}
