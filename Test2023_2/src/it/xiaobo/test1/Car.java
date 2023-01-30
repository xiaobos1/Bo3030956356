package it.xiaobo.test1;

public class Car {
    private String name;
    private double price;
    //无参构造器
    public Car(){}
//    有参构造器
    public Car(String name,double price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void Run(){
        System.out.println(price+"元的"+name+"正在启动~~");
    }

}
