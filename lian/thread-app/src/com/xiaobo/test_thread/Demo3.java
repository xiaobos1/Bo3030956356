package com.xiaobo.test_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3 {
    public static void main(String[] args) {
        Callable<String> call=new MyCallable(100);
        //把Callable任务对象交给FutureTask对象
        FutureTask<String> f1=new FutureTask<>(call);

        //交给线程管理
        Thread t1=new Thread(f1);

        t1.start();

        try{
            String rs=f1.get();
            System.out.println("第一个结果 "+rs);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n){
        this.n=n;
    }


    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        return "子线程的执行结果"+sum;
    }
}
