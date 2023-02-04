package com.xiaobo.set1;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {

        sum(1,2,3,4,5);
    }

    private static void sum(int... num) {
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));
    }
    //可变参数

}
