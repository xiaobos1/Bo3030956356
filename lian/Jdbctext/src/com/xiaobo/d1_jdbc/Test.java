package com.xiaobo.d1_jdbc;

import com.xiaobo.pojo.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        List<Account> list=new ArrayList<>();
        //连接数据库
        String url="jdbc:mysql://localhost:3306/bdtest2?useSSL=false&serverTimezone=UTC";
        String username="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //获取sql执行对象
        Statement stat =connection.createStatement();

        //创建sql语句
        String sql="select * from acount";

        ResultSet rs = stat.executeQuery(sql);

        //遍历
        while(rs.next()){
            int id = rs.getInt("id");
            String name=rs.getString("name");
            double money=rs.getDouble(3);
            Account ac=new Account(id,name,money);
            list.add(ac);
        }
        System.out.println(list);

        //释放资源
        rs.close();
        stat.close();
        connection.close();
    }
}
