package com.xiaobo.api_localdate;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ifPhoneId();
    }
    public static void ifPhoneId(){
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("输入你的电话号码：");
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("格式正确");
                break;
            } else {
                System.out.println("格式错误");
            }
        }
    }
}
