package com.xiaobo.d1_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class Jdbc_demo1 {
    public static void main(String[] args) throws Exception {
//        //注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql:///bdtest2?useSSL=false&serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql="update my_employees set salary=salary+1 where id=1";
        String sql1="update my_employees set salary=salary+1 where id=2";

        //获取执行sql对象
        Statement stat=connection.createStatement();

        try {
            //开启事务
            connection.setAutoCommit(false);
            //执行sql
            int i = stat.executeUpdate(sql);
            System.out.println("受影响的行数"+i);

            int i1=stat.executeUpdate(sql1);
            System.out.println("受影响的行数："+i1);

            //提交事务
            connection.commit();
        } catch (SQLException e) {
            //回滚事务
            connection.rollback();
            e.printStackTrace();
        }

        //结束
        stat.close();
        connection.close();
    }
}
