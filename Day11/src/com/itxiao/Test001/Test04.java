package com.itxiao.Test001;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test04 {
    public static void main(String[] args) {
        //创建一个Arraylist集合‘
        ArrayList<String> list=new ArrayList<>();
        list.add("zhangsan,23");
        list.add("lisi,19");
        list.add("wangwu,25");

        //保留年龄大于等于24的人
        //
        //
        list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1])>=24)
                .forEach(s-> System.out.println(s));
    }
}
