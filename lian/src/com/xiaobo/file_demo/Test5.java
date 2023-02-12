package com.xiaobo.file_demo;

import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        //设置指定时间
        calendar.set(2021,1,1);
        //增加时间
        calendar.add(Calendar.DATE,100);
        //获取指定年
        int year=calendar.get(Calendar.YEAR);
        //YUE
        int month=calendar.get(Calendar.MONTH);

        int day=calendar.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
