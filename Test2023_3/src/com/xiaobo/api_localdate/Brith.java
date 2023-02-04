package com.xiaobo.api_localdate;

import java.time.LocalDate;
import java.time.MonthDay;

public class Brith {
    public static void main(String[] args) {
        //判断生日
        LocalDate bri=LocalDate.of(2001,2,3);
        //获取今天的消息
        LocalDate now=LocalDate.now();

        //获取月日对象
        MonthDay brith=MonthDay.of(bri.getMonth(),bri.getDayOfMonth());
        MonthDay newDay=MonthDay.now();
        if(brith.equals(newDay)){
            System.out.println("生日快乐");
        }else{
            System.out.println("sorry");
        }
    }
}
