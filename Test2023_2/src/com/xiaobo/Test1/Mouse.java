package com.xiaobo.Test1;

public class Mouse implements USB {
    private String name;

    public Mouse(){}
    public String getName() {
        return name;
    }

    public Mouse(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mouseXi(){
        System.out.println("用"+name+"点击软件");
    }


    @Override
    public void push() {
        System.out.println(name+"成功连接了电脑");
    }

    @Override
    public void pop() {
        System.out.println(name+"成功从电脑中拔出");
    }
}
