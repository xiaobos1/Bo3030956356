package com.xiaobo.polymorphic;

public class Animal {
    public void  run(){
        System.out.println("动物在奔跑！！");
    }
}
class Dog extends Animal{
    @Override
    public void run(){
        System.out.println("🐕在迅速的跑动");
    }

    //子类独有功能
    public void toTail(){
        System.out.println("🐕在摇尾巴");
    }

}
class Tortoise extends Animal{
    @Override
    public void run() {
        System.out.println("🐢跑的很慢");
    }

    public void layEggs(){
        System.out.println("🐢在下蛋");
    }
}
