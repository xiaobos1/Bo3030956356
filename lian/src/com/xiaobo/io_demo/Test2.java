package com.xiaobo.io_demo;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        //字符缓冲流
        try (
            BufferedReader br=new BufferedReader(new FileReader("F:\\xiaobo\\lian\\src\\data.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("F:\\xiaobo\\lian\\src\\date.txt"));
        ){
            String len;
            while((len=br.readLine()) !=null){
                bw.write(len);
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
