package com.xiaobo.stringbuilderdemo;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
//        sb.append("a");
//        sb.append("abc");
//        sb.append(234);
        sb.append(6).append("我爱你中国").append(666);
        String str=sb.toString();
        sb.reverse();
        System.out.println(str);
        System.out.println(sb);
    }
}
