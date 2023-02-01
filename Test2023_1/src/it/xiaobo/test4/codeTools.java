package it.xiaobo.test4;

import java.util.Random;

public class codeTools {
    //一个生成验证码的工具类

    /**
     * 工具类要私有化，用类名调用static方法
      */
    private codeTools(){}


    public static String newCode(int n){
        //创建空字符串
        String code="";

        //将所有字符放到以个字符串中
        String str="abcdefghijklmnopqrstuvwsyzABCDEFGHIJKLMNOPQRSTUVWSYZ1234567890";

        Random r=new Random();
        //循环n次
        for (int i = 0; i < n; i++) {
            //记录字符
           code +=str.charAt(r.nextInt(str.length()));
        }

        return code;
    }

}
