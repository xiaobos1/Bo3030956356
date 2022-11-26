package com.itxiao.Test001;

import java.util.ArrayList;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("张三丰");
        list.add("赵敏");
        list.add("张强");

        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));


//        //将所有性张的添加到新集合中
//        ArrayList<String> list1=new ArrayList<>();
//        for(String s:list){
//            if(s.startsWith("张")){
//                list1.add(s);
//            }
//        }
//
//
//        //把以张开头，长度为三的添加到list2中
//        ArrayList<String> list2=new ArrayList<>();
//
//        for(String name:list1){
//            if(name.length()==3){
//                list2.add(name);
//            }
//        }
//
//      print(list);
//      print(list1);
//      print(list2);
//}
//    public static void print(ArrayList<String> list){
//        for(String name:list){
//            System.out.println(name);
//        }

    }

}
