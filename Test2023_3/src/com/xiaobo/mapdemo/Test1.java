package com.xiaobo.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("尹志平",400);
        map.put("灭绝",500);
        map.put("白小纯",1009);
        map.put("太后娘娘",1000);

        System.out.println(map);


//        for (String s: map.keySet()){
//            System.out.println(s+"===>"+map.get(s));
//        }

//        //将map集合转换为set集合
//        Set<Map.Entry<String,Integer>> entries=map.entrySet();
//
//        //遍历
//        for (Map.Entry<String, Integer> e : entries) {
//            System.out.println(e.getKey()+"==="+e.getValue() );
//        }

        //map Lambda表达式
        map.forEach((s, integer) -> System.out.println(s+"====>"+integer));
    }
}
