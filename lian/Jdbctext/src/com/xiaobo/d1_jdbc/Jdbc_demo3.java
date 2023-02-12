package com.xiaobo.d1_jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * JDBC快速入门
 */
public class Jdbc_demo3 {
    @Test
    public void testPreparedStatement() throws Exception {
        //获取连接
        String url="jdbc:mysql:///bdtest2?useSSL=false&serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //设置登录名字和密码
        String name="zhangsan";
        String pwd="123";
        String sql="select * from test where name= ? and password= ?";
        //获取preparedStatement对象
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,name);
        ps.setString(2,pwd);
        //调用executeQuery
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

    }
}
