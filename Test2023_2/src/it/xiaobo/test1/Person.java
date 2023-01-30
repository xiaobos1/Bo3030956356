package it.xiaobo.test1;

public class Person {
    private int age;
    private String name;

    public Person(String name){
    }
    public Person(int age){
        if(age>=0){
            this.age=age;
        }else{
            System.out.println("错误");
        }

    }
}
