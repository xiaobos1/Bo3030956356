package com.xiaobo.io_demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream os=new FileOutputStream("F:\\xiaobo\\lian\\src\\2.txt");
        //public void write(int a)一个字节写进去
        os.write('a');
        os.write(98);
        //os.write('徐');
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));

        byte[] buffer={'a',97,98,99};
        os.write(buffer);
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));
        byte[] b1="我是中国人".getBytes(StandardCharsets.UTF_8);
        os.write(b1);















        //写数据必须刷新资源
        os.close();//释放资源

    }
}
