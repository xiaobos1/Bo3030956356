package com.xiaobo.Test1;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name+"开机了");
    }

    public void installUSB(USB u){
        //多态
        //接入
        u.push();

        //独有功能
        if(u instanceof  KeyBoard){
            KeyBoard k=(KeyBoard) u;
            k.KeyDown();
        }else if(u instanceof Mouse){
            Mouse m=(Mouse)u;
            m.mouseXi() ;
        }
        //拔出
        u.pop();
    }
}
