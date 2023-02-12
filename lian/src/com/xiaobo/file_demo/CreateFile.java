package com.xiaobo.file_demo;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
            File f=new File("F:\\xiaobo\\picture\\mn.jpg");
            File f1=new File("F:\\xiaobo\\lian\\src\\data.txt");
        try {
            System.out.println(f1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f2=new File("F:\\xiaobo\\lian\\src\\data.txt");
        System.out.println(f2.delete());
    }
}
