package com.xiaobo.file_demo;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        //遍历文件夹
        File f=new File("F:\\xiaobo\\picture");
        String[] names=f.list();
        for (String name : names) {
            System.out.println(name);
        }
        //获取当前目录的"一级文件对象"到一个文件数组中返回
        File[] files=f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
        //注意事项
        File dir=new File("G:/aa");
        System.out.println(dir);
    }
}