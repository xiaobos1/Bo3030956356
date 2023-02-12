package com.xiaobo.d1_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class Jdbc_demo {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql://localhost:3306/bdtest2?useSSL=false&serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql="update my_employees set salary=salary+3000 where id=1";

        //获取执行sql对象
        Statement stat=connection.createStatement();

        //执行sql
        int i = stat.executeUpdate(sql);
        System.out.println("受影响的行数"+i);

        stat.close();
        connection.close();
    }
}
