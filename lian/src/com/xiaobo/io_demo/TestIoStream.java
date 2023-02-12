package com.xiaobo.io_demo;

import java.io.*;

/**
   将视频从
 */
public class TestIoStream {
    public static void main(String[] args) throws IOException {
        InputStream  is=new FileInputStream("E:\\视频.mp4");

        //创建一个字节输出六与目标文件接通
        OutputStream os=new FileOutputStream("F:\\视频.mp4");

        //定义一个字节数组转移数据
        byte[] buffer=new byte[1024];
        int len;
        while((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }

        System.out.println("复制完成");
        //关闭流
        os.close();
        is.close();
    }
}
