package com.xiaobo.Test2;

public class demo2 {
    public static void main(String[] args) {
        Swim s=new Swim() {
            @Override
            public void swim() {
                System.out.println("学生在快乐的游泳");
            }
        };
        go(s);
        System.out.println("======================");
        Swim s1=new Swim() {
            @Override
            public void swim() {
                System.out.println("老师好像在水里奔跑");
            }
        };
        go(new Swim() {
            @Override
            public void swim() {
                System.out.println("老师好像在水里奔跑");
            }
        });
    }

    /**
      老师 学生 运动员 可以一起参加游泳
     */

    public static void go(Swim s){
        System.out.println("开始===");
        s.swim();
        System.out.println("结束===");
    }
}




interface Swim{
    void swim();
}

