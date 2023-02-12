package com.xiaobo.tcp_test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args){
        //创建客户端对象
        try {
            Socket socket=new Socket("127.0.0.1",7777);

            //从socket通信管道中得到一个字节输出流，负责发送数据
            OutputStream os=socket.getOutputStream();

            //把低级字节流包装成打印流
            PrintStream ps=new PrintStream(os);

            //发送信息
            ps.println("tcp客户端，约吗~~");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
