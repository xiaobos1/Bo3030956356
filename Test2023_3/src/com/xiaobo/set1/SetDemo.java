package com.xiaobo.set1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    //set集合，无序，不重复，无索引
    public static void main(String[] args) {
        //创建set对象
        Set<String> set=new HashSet<>();
        //添加数据
        set.add("Java");
        set.add("Java");
        set.add("Mysql");
        set.add("Mysql");
        set.add("c++");
        set.add("c++");
        set.add("牛马工程师");
        set.add("牛马工程师");

        System.out.println(set);
    }
}
