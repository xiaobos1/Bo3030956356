package com.xiaobo.api_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        System.out.println(c);

        //lambda表达式
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        c.forEach(s-> System.out.println(s));
//        //创建迭代器
//        Iterator<String> it=c.iterator();
//        System.out.println(it.next());
//        for (int i = 0; i < c.size(); i++) {
//            if(it.hasNext()){
//                System.out.println(it.next());
//            }
//        }
    }
}
