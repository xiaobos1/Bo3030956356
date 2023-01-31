package it.xiaobo.test;

public abstract class Shout {
    public abstract void shout();
}

class NewDog extends Shout{


    @Override
    public void shout() {
        System.out.println("汪汪~");
    }
}
interface Animal1{
    int id=1;
    void breathe();  //定义抽象方法

    //定义一个默认方法
    default  void getType(String type){
        System.out.println("该动物属于："+type);
    }

    //定义一个静态方法
    static int getId(){
        return id;
    }
}
class Dog2 implements Animal1{

    @Override
    public void breathe() {
        System.out.println("狗在呼吸");
    }
}

