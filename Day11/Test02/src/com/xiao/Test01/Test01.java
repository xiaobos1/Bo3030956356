package com.xiao.Test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"张无忌","周芷若","张三丰","赵敏","张强","蔡徐坤");

                //lam
        // list.stream().forEach(s -> System.out.println(s));

//        for(String name:list) {
//            System.out.print(name+" ");
//        }



//        String arr[]=list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new Object[0];
//            }
//        });

        //long count 统计
        long c = list.stream().count();
        System.out.println(c);
    }
}
