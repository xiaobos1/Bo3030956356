package it.xiaobo.test;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Animal1.getId());

        Dog2 dog=new Dog2();
        System.out.println(dog.id);
        dog.breathe();
        dog.getType("犬科");
    }
}
