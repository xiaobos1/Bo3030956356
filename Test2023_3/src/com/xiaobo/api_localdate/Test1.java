package com.xiaobo.api_localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test1 {
    public static void main(String[] args) {
        //创建LocalDate 对象可以直接获取年月日
        LocalDate nowDate=LocalDate.now();
        System.out.println(nowDate); //今天的年月日


        //测试方法
        System.out.println("year:"+nowDate.getYear());
        System.out.println("month:"+nowDate.getMonthValue());

        //指定时间
        LocalDateTime myDate=LocalDateTime.of(2021,8,6,11,11,11);
        System.out.println(myDate.minusDays(24 * 2 * 60 * 60));


        //创建LocalTime对象
        LocalTime nowTime=LocalTime.now();
        System.out.println(nowTime);

        //测试方法
        System.out.println("小时："+nowTime.getHour());
        System.out.println(nowTime.getMinute()+"分");
        System.out.println(nowTime.getSecond()+"秒");
    }
}
