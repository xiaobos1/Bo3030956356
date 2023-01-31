package it.xiaobo.test;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
       //正确的登录名和密码
        String okName="xiaobo";
        String password="123456";

        //输入正确的密码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号：");
        String userName=sc.next();
        System.out.println("请输入密码：");
        String userPassword=sc.next();
        //获取正确验证码并展示
        String  okCode=verCode();
        //判断用户密码等是否正确
        boolean f=false;
        while(!f){
            System.out.println(okCode);
            System.out.println("输入正确的验证码");
            String userCode=sc.next();
            if(okCode.equalsIgnoreCase(userCode)){
                f=true;
            }
        }
        if(okName.equals(userName)&&password.equals(userPassword)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
    //验证码
    public static String verCode(){
        String str="";
        Random r=new Random();
        for(int i=0;i<4;i++){
            //生成四个字符组成的字符串验证码
            //0 大写字母 ，1 小写字母，2数字
            int o=r.nextInt(3);
            switch(o){
                case 0:
                    char c1=(char)(r.nextInt(26)+65);
                    str +=c1;
                    break;
                case 1:
                    char c2=(char)(r.nextInt(26)+97);
                    str +=c2;
                    break;
                case 2:
                    int c3=r.nextInt(10);
                    str+=c3;
                    break;
                default:
                    break;
            }
        }
        return str;
    }

}
