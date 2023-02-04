package com.xiaobo.mapdemo;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //使用一个Map集合存储
        Map<String, List<String>> date=new HashMap<>();
        //添加学生数据
        List<String> selects=new ArrayList<>();
        Collections.addAll(selects,"A","B","C","D");
        date.put("简风",selects);

        List<String> selects1=new ArrayList<>();
        Collections.addAll(selects1,"A","B","C");
        date.put("富强",selects1);

        List<String> selects2=new ArrayList<>();
        Collections.addAll(selects2,"A","D");
        date.put("小博",selects2);

        //定义一个HashMap
        Map<String,Integer> info=new HashMap<>();

        //
        Collection<List<String>> values=date.values();
        System.out.println(values);
        for (List<String> value : date.values()) {
            for (String s : value) {
                if(info.containsKey(s)){
                    info.put(s,info.get(s)+1);
                }else{
                    info.put(s,1);
                }
            }

        }
        System.out.println(info);
    }
}
