package com.xiaobo.test_1;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        String[] names={"小葵","蓉蓉","小何"};
        printArray(names);

        Integer[] arr={1,2,3,34,44};
        printArray(arr);
    }
    //泛型方法
    public static <T> void printArray(T[] arr){
        if(arr !=null){
            StringBuilder sb=new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                if(i!=arr.length-1){
                    sb.append(arr[i]).append(",");
                }else {
                    sb.append(arr[i]).append("]");
                }
            }
            System.out.println(sb);
        }else{
            System.out.println(arr);
        }

    }
}
