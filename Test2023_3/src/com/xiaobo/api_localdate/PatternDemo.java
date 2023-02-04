package com.xiaobo.api_localdate;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    //爬取技术
    public static void main(String[] args) {
        String str= "15576290716认为估价应为：￥ 9999999" +
                "15567956767提交机主姓名 刘****琦" +
                "18257757781认为估价应为：￥ 600" +
                "13611376130提交机主姓名 董****花" +
                "13880470494提交机主姓名 邓****全" +
                "19809336480标记为正常号码 HELLO" +
                "19809336480提交机主姓名 M****" +
                "16561159098提交机主姓名 M****" +
                "17809989737提交机主姓名 麦****提 18957511110认为系统估价偏 uangweixu928396@126.com—-yang5366" +
                " gaojinling126206@126.com—-hang2429 " +
                "dingjimin920168@126.com—-zhou7406"+
                "xiaohua661085@126.com—-wang6479";


        String rex="1[3-9]\\w{9}|\\w{5,20}@\\w{2,6}(\\.[0-9a-zA-Z]{2,3})";

        //创建pattern对象
        Pattern p = Pattern.compile(rex);

        //得到一个匹配器对象
        Matcher m=p.matcher(str);

        while(m.find()){
            String s=m.group();
            System.out.println(s);
        }
    }
}
