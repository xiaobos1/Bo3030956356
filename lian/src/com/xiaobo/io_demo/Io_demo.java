package com.xiaobo.io_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Io_demo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        InputStream io = new FileInputStream("F:\\xiaobo\\lian\\src\\data.txt");

        //读取数据
        int b;
        while((b=io.read())!=-1){
            System.out.println((char)b);
        }
    }
}
