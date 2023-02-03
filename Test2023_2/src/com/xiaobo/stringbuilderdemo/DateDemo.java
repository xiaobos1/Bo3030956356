package com.xiaobo.stringbuilderdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d =new Date();
        System.out.println(d);
        //获取时间毫秒值
        long time1=d.getTime();
        System.out.println("---------------");
        //得到当前时间毫秒值
        Date d1=new Date();

        long time2=System.currentTimeMillis();
        time2 += (60*60+121)*1000;

        Date d3=new Date(time2);
        System.out.println(d3);

        System.out.println("-------");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化
        String rs=sdf.format(d1);
        System.out.println(rs);
        System.out.println("---------");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        time1 +=121*1000;
        String s=sdf1.format(time1);
        System.out.println(s);

    }
}
