package it.xiaobo.test3;

import java.util.ArrayList;

public class MovieDemo {
    public static void main(String[] args) {
        //创建电影集合
        ArrayList<Movie> list=new ArrayList<>();
        //创建电影对象
        Movie m1 = new Movie("《肖申克的救赎》",9.7,"罗宾斯");
        Movie m2 = new Movie("《霸王别姬》",9.6,"张国荣,张丰毅");
        Movie m3 = new Movie("《啊甘正传》",9.5,"汤姆，汉克斯");
        //添加到集合中
        list.add(m1);
        list.add(m2);
        list.add(m3);

        //遍历
        for (Movie movie : list) {
            System.out.println("电影名称:"+movie.getName());
            System.out.println("电影得分:"+movie.getScore());
            System.out.println("电影主演:"+movie.getActor());
        }
    }
}
