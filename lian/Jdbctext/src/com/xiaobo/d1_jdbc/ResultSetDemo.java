package com.xiaobo.d1_jdbc;

import org.junit.Test;

import java.sql.*;

public class ResultSetDemo {
    @Test
    public void Test() throws Exception {
        //executeQuery
        String url="jdbc:mysql://localhost:3306/bdtest2?useSSL=false&serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //定义查询语句
        String sql="select * from my_employees";

        //或群执行对象Statement
        Statement stat = connection.createStatement();

        //运行
        ResultSet res = stat.executeQuery(sql);

        //返回结果
        while(res.next()){
            int id= res.getInt(1);
            String firstName=res.getString(2);
            String lastName=res.getString(3);
            String userId=res.getString(4);
            double salary=res.getDouble(5);

            System.out.println(id+" "+firstName+" "+lastName+" "+userId+" "+salary);

        }
        //释放资源
        res.close();
        stat.close();
        connection.close();

    }
}
