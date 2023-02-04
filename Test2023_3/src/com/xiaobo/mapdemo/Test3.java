package com.xiaobo.mapdemo;

public class Test3 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,5,6,7,8};
        int[] arr=NewArray(array,5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] NewArray(int[] arr,int n){
        int[] newArr=new int[arr.length-1];
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != n){
                newArr[c++]=arr[i];
            }
        }
        return newArr;
    }
}
