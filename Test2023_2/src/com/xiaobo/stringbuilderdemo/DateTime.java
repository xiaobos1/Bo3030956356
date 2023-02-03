package com.xiaobo.stringbuilderdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) throws ParseException {
        //有一个时间2021年8月06日 11：11：11
        // 往后 2天 14小时49分06秒后的时间时多少
        //把字符串时间拿到程序来
        String dateStr="2021年8月06日 11:11:11";

        //把字符时间解析成日期对象***
        SimpleDateFormat sd=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sd.parse(dateStr);

        //往后走2天14小时49分06秒
        long time=(24*2*60*60+14*60*60+49*60+6)*1000;
        long d1=d.getTime()+time;
        //格式化这个时间
        String str=sd.format(d1);
        System.out.println(str);
    }

}
