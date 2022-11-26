package com.itxiao.Test001;

public class Test01 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int j = 0; j<5-i; j++) {
                System.out.print(" ");
            }
            //打印*
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
