package com.itxiao.test3;

public class Dog extends Animal{
    private String name;
    public Dog(){}
    public Dog(String name){
        this.name=name;
    }
    public void printName(){
        System.out.println("name="+name);
    }

    @Override
    public void shout() {
        System.out.println(name+"在汪汪汪叫");
    }
}
