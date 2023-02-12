package com.xiaobo.test1_thread;

public class DrawThread extends Thread{
    private Account ac;
    public DrawThread(Account ac,String name){
        super(name);
        this.ac=ac;
        //super(name);
    }
    @Override
    public void run() {
        ac.drawMoney(100000);
    }
}
