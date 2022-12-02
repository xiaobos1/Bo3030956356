package com.xiao.Test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周芷若-女-18","张三丰-男-100","赵敏-女-16","张强-男-17","蔡徐坤-男-24");


//        //把所有男性收集起来
//        List<String> newList=list.stream()
//                .filter(s->"男".equals(s.split("-")[1]))
//                .collect(Collectors.toList());
//
//        System.out.println(newList);
        
        
//        list.stream()
//                .filter((s->"男".equals(s.split("-")[1])).collect()
    }
}
