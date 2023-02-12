package com.xiaobo.io_demo;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //定义一个字符输入流
        Reader rd=null;

        Writer wt=null;
        try {
            rd=new FileReader("F:\\xiaobo\\lian\\src\\data.txt");
            //定义一个字符输入流
            wt=new FileWriter("F:\\琵琶行.txt");

            //定义一个字符数组
            char[] chars=new char[100];
            int len;
            while((len=rd.read(chars))!=-1){
                wt.write(chars,0,len);
            }
            System.out.println("复制成功");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                wt.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            rd.close();
        }
    }
}
