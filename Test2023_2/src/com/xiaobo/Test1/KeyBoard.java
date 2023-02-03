package com.xiaobo.Test1;

public class KeyBoard implements USB{
    private String name;

    public  KeyBoard(){}
    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void push() {
        System.out.println(name+"成功连接了电脑");
    }

    @Override
    public void pop() {
        System.out.println(name+"成功从电脑中拔出");
    }

    public void KeyDown(){
        System.out.println("敲击"+name+"这个键盘");
    }
}
