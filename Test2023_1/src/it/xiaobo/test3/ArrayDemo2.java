package it.xiaobo.test3;

import java.util.ArrayList;

public class ArrayDemo2 {
    public static void main(String[] args) {
      //ArrayList<>
      ArrayList<String> list=new ArrayList<>();
      //只添加String 的元素
      list.add("mysql");
      list.add("王宝强");
      list.add("贾乃亮");
      list.add("Java");
      //list.add(203); //错误

      //Integer 在集合中整型需要用Integer
      ArrayList<Integer> list1=new ArrayList<>();

      list1.add(555);


      //public get(int index) 获取某个索引处的元素值
        String str=list.get(0);
        System.out.println(str);

        //public int size(); //获取集合的大小
        System.out.println(list.size());

        //完成集合遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        //public E remove(int index); 删除某个索引位置的元素，并返回被删除的数据
        System.out.println(list.remove(1));

        //完成集合遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //remove(object o); 删除元素值，删除成功返回true ，删除失败返回false

        ArrayList<String> l=new ArrayList<>();
        l.add("贾乃亮");
        l.add("王宝强");
        l.add("陈羽凡");
        l.add("java");
        l.add("java");
        //排除异类
        boolean flag=l.remove("java");
        if(flag){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        //只会删除第一次出现的值
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i)+" ");
        }

    }
}
