package com.itxiao.Test001;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03 {
    public static void main(String[] args) {
        try {
            System.out.println("我是服务器");
            //自己的小服务器
            ServerSocket server=new ServerSocket(99);

            //等待客户端访问
            Socket socket=server.accept();

            System.out.println("有人链接我了");


            //读写   请求
//            InputStream inputStream = socket.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//            String value=reader.readLine();
//            System.out.println(value);
            //回写    响应
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter out=new PrintWriter(outputStream);
            out.write("HTTP1.1 200 ok\r\n");
            out.write("Content-Type:test/html;charset=UTF-8\r\n");
            out.write("\r\n");
            out.write("<html>");
            out.write("     <body>");
            out.write("           <input type='button' value='点我啊'>");
            out.write("     </body>");
            out.write("</html>");
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
