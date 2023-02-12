package com.xiaobo.test_demo;

import org.junit.Test;

import java.lang.reflect.Field;

public class Demo1 {
    @Test
    public void getDeclaredFields() throws Exception {
        //定位Class对象
        Class c=Student.class;
        //根据名称来定位某个成员变量
        Field ageF=c.getDeclaredField("age");
        //System.out.println(f.getName()+"===>"+f.getType());
        //赋值
        Student stu=new Student();

        ageF.setAccessible(true);
        ageF.set(stu,18);
        System.out.println(stu);
    }
}
