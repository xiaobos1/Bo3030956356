package it.xiaobo.test;

public class Animal {
    private String name;
    private int age;

    public Animal(){}
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void shout(){
        System.out.println("发出叫声");
    }

}
final class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println(super.getName()+"发出汪汪的叫声");
    }
}

