package com.itxiao.Test001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
        //创建一个列表
        ArrayList<Integer> list=new ArrayList<>();
        //利用collections工具类来添加元素
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);
        //过滤奇数只留偶数
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
