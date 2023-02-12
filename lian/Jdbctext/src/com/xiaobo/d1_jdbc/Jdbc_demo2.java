package com.xiaobo.d1_jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * JDBC快速入门
 */
public class Jdbc_demo2 {
    @Test
    public void testJdbc() throws Exception {
        //获取连接
        String url="jdbc:mysql:///bdtest2?useSSL=false&serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //设置登录名字和密码
        String name="zhangsan";
        String pwd="gjg";
        String sql="select * from test where name='"+name+"'and password='"+pwd+"'";
        //获取statement对象
        Statement  st= connection.createStatement();
        //调用executeQuery
        ResultSet rs = st.executeQuery(sql);

        if(rs.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

    }
}
