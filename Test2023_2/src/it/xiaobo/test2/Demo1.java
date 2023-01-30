package it.xiaobo.test2;

public class Demo1 {
    public static void main(String[] args) {
        Film[] f=new Film[3];
        f[0] =new Film("《长津湖》",8.7,"吴京");
        f[1] =new Film("《我和我的父亲》",8.9,"吴京");
        f[2]=new Film("《扑水少年》",8.8,"王川");

        for (int i = 0; i < f.length; i++) {
            Film f1=f[i];
            System.out.println("片名："+f1.getName());
            System.out.println("评分："+f1.getScore());
            System.out.println("主演："+f1.getActor());
        }
    }
}
