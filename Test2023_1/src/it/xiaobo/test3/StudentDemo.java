package it.xiaobo.test3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        //定义学生集合
        ArrayList<Student> stu=new ArrayList<>();
        //存储学生对象
        stu.add(new Student("202001","叶孤城",23,"护理一班"));
        stu.add(new Student("202002","东方不败",23,"推拿二班"));
        stu.add(new Student("202003","西门吹雪",22,"中药学四班"));
        stu.add(new Student("202004","梅超风",26,"神经科五班"));
        //遍历
        System.out.println("学号\t\t名称\t\t年龄\t班级");
        for (Student s:stu){
            System.out.println(s.getStudyNumber()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getClassNumber());
        }
        //死循环
        while(true) {
            Student s1 = getStudentId(stu);
            //判断是否有人
            if (s1 == null) {
                System.out.println("查无此人");
            } else {
                System.out.println(s1.getStudyNumber() + "\t" + s1.getName() + "\t" + s1.getAge() + "\t" + s1.getClassNumber());

            }
        }
    }
    public static Student getStudentId(ArrayList<Student> stu){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你的学号");
        String studentId=sc.next();

        for(Student s:stu){
            if(s.getStudyNumber().equals(studentId)){
                return s;
            }
        }
        return null;
    }
}
