package com.xiaobo.test_1;

public class Test4 {
    public static void main(String[] args) {

    }
}

interface date<E>{
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}
class Student implements date<Student>{

    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student queryById(int id) {
        return null;
    }
}
class Teacher implements date<Teacher>{

    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Teacher teacher) {

    }

    @Override
    public Teacher queryById(int id) {
        return null;
    }
}
