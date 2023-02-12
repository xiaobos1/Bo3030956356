package com.xiaobo.net_test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class NextDemo {
    public static void main(String[] args) throws Exception {
        //创建接收端对象
        DatagramSocket socket=new DatagramSocket(8888);

        //创建一个数据包对象来接受数据
        byte[] buffer=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer, buffer.length);

        while (true) {
            //接受数据
            socket.receive(packet);
            //取出数据
            int len=packet.getLength();
            String rs=new String(buffer,0,len);
            System.out.println("收到ip:"+packet.getSocketAddress()+"发送的信息:\n"+rs);

        }
    }
}
