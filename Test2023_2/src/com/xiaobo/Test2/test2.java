package com.xiaobo.Test2;

public class test2 {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的块");
            }
        };

        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}
