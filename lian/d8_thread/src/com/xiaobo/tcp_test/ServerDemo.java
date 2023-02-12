package com.xiaobo.tcp_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) {
        System.out.println("======服务端启动=====");
        try {
            ServerSocket server=new ServerSocket(7777);
            //
            Socket so=server.accept();
            //得到以个字节输入流
            while(true){
                Socket socket=server.accept();
                System.out.println(socket.getRemoteSocketAddress()+"它上线了");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
