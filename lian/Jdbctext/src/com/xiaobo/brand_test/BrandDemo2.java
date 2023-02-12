package com.xiaobo.brand_test;

import com.xiaobo.pojo.Brand;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BrandDemo2 {
    @Test
    public void BrandTestInsert() throws Exception {
//        String usl="jdbc:mysql:///"
        String usl="jdbc:mysql:///bdtest2?useSSL=false&serverTimezone=UTC";
        String name="root";
        String password="root";
        Connection c = DriverManager.getConnection(usl,name,password);

        //定义sql
        String sql="insert into tb_brand(brand_name,company_name,ordered,description,status) values"+
             "(?,?,?,?,?);";
        //获取preparedState
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1,"腾讯");
        ps.setString(2,"腾讯科技有限公司");
        ps.setInt(3,1500);
        ps.setString(4,"抽到次装备的概率为50");
        ps.setInt(5,1);

        //运行程序
        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        BrandDemo1 b=new BrandDemo1();
        b.BrandTest();
        //
        ps.close();
        c.close();
    }
}
