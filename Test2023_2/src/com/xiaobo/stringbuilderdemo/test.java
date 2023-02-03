package com.xiaobo.stringbuilderdemo;

public class test {
    public static void main(String[] args) {
        int[] arr={12,22,33,44,55,66,77,88,99};
        String str=Print(arr);
        System.out.println(str);

    }
    public static String Print(int[] arr){
        if(arr==null) return null;
        StringBuilder sb=new StringBuilder();
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                sb.append(arr[i]).append(",");
            }else{
                sb.append(arr[i]).append("]");
            }
        }
        return str+sb.toString();
    }

}
