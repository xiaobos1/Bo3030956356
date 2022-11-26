package com.itxiao.Test001;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //单列集合获取stream流
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f");


        list.stream().forEach(s-> System.out.println(s));






//        //获取到一条流水线、
//        Stream<String> stream=list.stream();
//        //是由终结方法打印所有流水线的所有数据
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
    }
}
