package com.xiaobo.io_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        InputStream io = new FileInputStream("F:\\xiaobo\\lian\\src\\data.txt");

        //定义一个字节数组，用于读取字节
        byte[] b=new byte[9999];
        int len;
        while((len= io.read(b))!=-1){
            String s=new String(b,0,len);
            System.out.print(s);
        }
    }
}
