package com.xiaobo.stringbuilderdemo;

public class test001 {
    public static void main(String[] args) {
        int[] arr={12,22,33,44,55,66,77,88,99,1,2,2,5,48,9,63,9,7,8,5};
        int[] arr1=new int[100000];
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arr1[i]=i;
            System.out.println(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0+"s");
//        int count=0;
//        long startTime=System.currentTimeMillis();
//        for (int i : arr1) {
//            count++;
//        }
//        long endTime=System.currentTimeMillis();
//        System.out.println((endTime-startTime)*1000+"s");
    }
}
