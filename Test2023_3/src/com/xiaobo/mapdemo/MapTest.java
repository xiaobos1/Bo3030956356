package com.xiaobo.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //创建map对象
        Map<String,Integer> map=new HashMap<>();

        //添加键，值map.put(String s,Integer);
        map.put("java",1);
        map.put("尹志平",3);
        map.put("杨过",3);
        map.put("java1",3);
        System.out.println(map);

        //通过键获取值
        System.out.println(map.get("java"));
        System.out.println(map.get("java2"));
        //键 出现重复时覆盖上一个键的值

        //清空集合
        //map.clear();
       // System.out.println(map);

        //判断集合是否为空
        System.out.println(map.isEmpty());

        //remove
        //System.out.println(map.remove("java"));//删除这个键并返回这个值

        //判断是否包含某个值
        System.out.println(map.containsValue(1));
        //是否包含某个键
        System.out.println(map.containsKey("java"));

    }
}
