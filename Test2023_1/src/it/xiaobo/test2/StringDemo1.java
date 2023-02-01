package it.xiaobo.test2;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入您的电话号码：");
        String tel=sc.next();

        //截取中间四位
        String tel1=tel.substring(3,7);
        //屏蔽中间四位
        String tel2=tel.replace(tel1," **** ");
        System.out.println(tel2);
    }
}
