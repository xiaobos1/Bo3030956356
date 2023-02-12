package com.xiaobo.brand_test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BrandDemo3 {
    @Test
    public void BrandTestUpdate() throws Exception {
//        String usl="jdbc:mysql:///"
        String usl="jdbc:mysql:///bdtest2?useSSL=false&serverTimezone=UTC";
        String name="root";
        String password="root";
        Connection c = DriverManager.getConnection(usl,name,password);

        //定义sql
        String sql="update tb_brand set description = ? where id=?";
        //获取preparedState
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1,"5G先锋");
        ps.setInt(2,2);
        //运行程序
        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("修改成功，修改"+i+"行");
        }else{
            System.out.println("修改失败");
        }
        BrandDemo1 b=new BrandDemo1();
        b.BrandTest();
//        //
        ps.close();
        c.close();
    }
}
