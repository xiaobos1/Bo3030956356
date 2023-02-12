package com.xiaobo.brand_test;

import com.xiaobo.pojo.Brand;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrandDemo1 {
    @Test
    public void BrandTest() throws Exception {
//        String usl="jdbc:mysql:///"
        String usl="jdbc:mysql:///bdtest2?useSSL=false&serverTimezone=UTC";
        String name="root";
        String password="root";
        Connection c = DriverManager.getConnection(usl,name,password);

        //定义sql
        String sql="select * from tb_brand";
        //获取preparedState
        PreparedStatement ps = c.prepareStatement(sql);

        //运行程序
        ResultSet rs = ps.executeQuery();
        List<Brand> list=new ArrayList<>();
        while(rs.next()){
            Integer id=rs.getInt(1);
            String brandName=rs.getString(2);
            String companyName=rs.getString(3);
            Integer ordered=rs.getInt(4);
            String description=rs.getString(5);
            Integer status=rs.getInt(6);
            Brand b=new Brand(id,brandName,companyName,ordered,description,status);
            list.add(b);
        }
        System.out.println(list);

        rs.close();
        ps.close();
        c.close();
    }
}
