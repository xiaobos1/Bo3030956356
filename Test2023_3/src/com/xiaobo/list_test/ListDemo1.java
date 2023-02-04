package com.xiaobo.list_test;

import java.util.LinkedList;

public class ListDemo1 {
    public static void main(String[] args) {
        //栈
        LinkedList<String> stack=new LinkedList<>();

        //先进后出 后进先出
        //压栈
        stack.addFirst("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        stack.push("第五颗子弹");
        //出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack);

        //队列
        LinkedList<String> queue=new LinkedList<>();
        //入队
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
