package com.xiaobo.Test1;

public class Test {
    public static void main(String[] args) {
        Computer c=new Computer("外星人");
        c.start();

        USB u=new Mouse("星人");
        u.push();
        USB u1=new KeyBoard("卤鸡键盘");
        u1.push();

        c.installUSB(u);
        c.installUSB(u1);
    }
}
