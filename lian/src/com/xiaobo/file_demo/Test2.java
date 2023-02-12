package com.xiaobo.file_demo;

import java.io.File;

/**
  目标：去F盘判断搜索 琵琶行.txt文件
 */
public class Test2 {
    public static void main(String[] args) {
        File f=new File("F:");
        String name="琵琶行.txt";
        searchFile(f,name);
    }

    /***
     *
     * @param dir 被搜所的源目录
     * @param name 被搜索的文件名称
     */
    public static void searchFile(File dir, String name){
        if(dir !=null&& dir.isDirectory()){
            File[] files=dir.listFiles();
            //判断是否存在一级文件目录
            if(files !=null&& files.length>0){
                for (File file : files) {
                    //判断是文件还是文件夹
                    if(file.isFile()) {
                        if (file.getName().equals(name)) {
                            System.out.println("找到了");
                        }
                    }else{
                        searchFile(file,name);
                    }
                }
            }
        }else{
            System.out.println("当前位置不是文件夹");
        }

    }
}
