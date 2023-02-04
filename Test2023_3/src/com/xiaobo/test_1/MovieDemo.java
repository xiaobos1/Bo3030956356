package com.xiaobo.test_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class MovieDemo {
    public static void main(String[] args) {
        Collection<Movie> m=new ArrayList<>();
        //添加元素
        m.add(new Movie("《你好，李焕英》",8.7,"张小斐，贾玲，陈赫"));
        m.add(new Movie("《唐人街探案3》",8.9,"王宝强，刘昊然，美女"));
        m.add(new Movie("《刺杀小说家3》",8.6,"雷佳音，杨幂"));

        //遍历集合容器中的每一个电影对象
//        //迭代器
//        Iterator<Movie> it=m.iterator();
//        while(it.hasNext()){
//            Movie m1=it.next();
//            System.out.println("电影名称："+m1.getName());
//            System.out.println("电影评分："+m1.getScore());
//            System.out.println("电影主演："+m1.getActor());
//        }
//        //增强for
//        for (Movie m1 : m) {
//            System.out.println("电影名称："+m1.getName());
//            System.out.println("电影评分："+m1.getScore());
//            System.out.println("电影主演："+m1.getActor());
//        }
        
        //lambda表达式
        m.forEach(movie ->{
                System.out.println("电影名称："+movie.getName());
                System.out.println("电影评分："+movie.getScore());
                System.out.println("电影主演："+movie.getActor());
        });
    }
}
