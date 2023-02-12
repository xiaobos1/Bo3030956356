package com.xiaobo.tcp_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerRunnable implements Runnable{
    private Socket socket;
    public ServerRunnable(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream is=socket.getInputStream();
            //把字节流包装成字节缓冲流
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            //
            String msg;
            while((msg=br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
