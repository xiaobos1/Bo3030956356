package it.xiaobo.test3;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        //创建Arraylist对象
        ArrayList list=new ArrayList();

        //添加数据
        list.add("java");
        list.add("牛马");
        list.add(23.5);
        list.add(23);
        list.add(false);
       // System.out.println(list);

        //给指定索引位置插入元素,在此位置处全部后移
        list.add(1,"赵敏");
        //System.out.println(list);

        /**
         *
         */

    }
}
