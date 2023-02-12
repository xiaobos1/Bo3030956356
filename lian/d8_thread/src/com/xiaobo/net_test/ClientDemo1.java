package com.xiaobo.net_test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
   UDP使用
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        while (true) {
            //创建一个数据包对象封装数据
            System.out.println("请说：");
            String str=sc.nextLine();
            if("exit".equals(str)){
                System.out.println("离线成功！");
                socket.close();
                break;
            }

            byte[] buffer=str.getBytes();
            DatagramPacket packet=new DatagramPacket(buffer,buffer.length
            , InetAddress.getLocalHost(),8888);
            //发送数据
            socket.send(packet);
        }
    }
}
