package it.xiaobo.test1;

public class Test01 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.setName("宝马");
        c1.setPrice(39.9);

        Car c2=new Car("奔驰",23.99);


        c1.Run();
        c2.Run();

        System.out.println("=========================");

        Person p=new Person(-1);
    }
}
