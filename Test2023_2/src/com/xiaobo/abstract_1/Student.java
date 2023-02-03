package com.xiaobo.abstract_1;

public abstract class Student {
    //模板方法
    public void write(){
        System.out.println("\t\t\t 《我的爸爸》");
        System.out.println("你的爸爸是啥样，来说说吧:");
        System.out.println(writeMain());
        System.out.println("哇我的爸爸太好了");
    }

    public abstract String writeMain();

}
