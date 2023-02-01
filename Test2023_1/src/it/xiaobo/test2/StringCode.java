package it.xiaobo.test2;

import java.util.Random;

public class StringCode {
    public static void main(String[] args) {
        //利用String[] 和 charAt()来获取验证码
        System.out.println(triCode(5));

    }
    public static String triCode(int n){
        Random r=new Random();
        String code="zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP1234567890";
        String newCode="";
        //循环
        for (int i = 0; i < n; i++) {
           //随机索引
           int index=r.nextInt(62);
           char ch=code.charAt(index);
           newCode +=ch;
        }
        return newCode;
    }
}
