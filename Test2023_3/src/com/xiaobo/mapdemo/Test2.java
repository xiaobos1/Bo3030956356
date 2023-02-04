package com.xiaobo.mapdemo;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        //80个学生的数据统计出来
        String[] word={"A","B","C","D"};
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append(word[r.nextInt(word.length)]);
        }
        //创建一个map
        Map<Character,Integer> map=new HashMap<>();
        int at=0,bt=0,ct=0,dt=0;
        for (int i = 0; i < sb.length(); i++) {
            char c=sb.charAt(i);
            //判断map集合中是否存在这个键
            if(map.containsKey(c)){
                //让其加一
                map.put(c,map.get(c)+1);
            }else{
                //不存在存入map集合中
                map.put(c,1);
            }
        }
//        //遍历集合
//        /**
//         键找值
//         */
//        for(Character ch:map.keySet()) {
//            System.out.println(ch+"->"+map.get(ch));
//        }

//        /**
//           键值对
//         */
        int count=0;
        Set<Map.Entry<Character, Integer>> entries=map.entrySet();
        for (Map.Entry<Character, Integer> key : entries) {
             System.out.println(key.getKey()+"-->"+map.get(key.getKey()));
             //找出最大值
             if(map.get(key.getKey())>count){
                 count=map.get(key.getKey());
             }
        }


//        //lambda表达式
//        map.forEach((character, integer) -> System.out.println(character+"->"+integer));
    }
}
