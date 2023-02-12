package com.xiaobo.file_demo;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo1 {
    public static void main(String[] args) {
//        //创建file对象(指定文件的路径）
//        //路径写法
//        File f=new File("F:\\xiaobo\\picture\\mn.jpg");
//        File f1=new File("F:/xiaobo/picture/mn.jpg");
//        long size =f.length();
//        System.out.println(size);
//
//        //File对象支持绝对路径 支持相对路径
//
//        //相对路径
//        File f3=new File("lian/src/t");
//        System.out.println(f3.length());

        //获取绝对路径
        File f4=new File("F:\\xiaobo\\picture\\mn.jpg");
        System.out.println(f4.getAbsolutePath());
        //b.获取文件定义的时候使用的路径
        System.out.println(f4.getPath());
        //b.获取文件名称，带后缀
        System.out.println(f4.getName());
        //C.获取文件最后修改的时间
        System.out.println(f4.lastModified());
        long time= f4.lastModified();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(s.format(time));

        //判断是文件还是文件夹
        System.out.println(f4.isFile());
        System.out.println(f4.isDirectory());

    }

}
