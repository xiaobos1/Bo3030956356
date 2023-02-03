package com.xiaobo.polymorphic;

public class test {
    public static void main(String[] args) {
        //使用多态的语法 父类名 对象 = new 子类构造器
        Animal a=new Dog();
        //乌龟对象
        //强制类型转换
        Animal t=new Tortoise();
        Tortoise t1= (Tortoise) t;

        //自动类型转换
        a.run();

        if(a instanceof Tortoise){
            ((Tortoise) t).layEggs();
        }else if(a instanceof Dog) {
            Dog g=(Dog)a;
            g.run();
        }
    }
}
