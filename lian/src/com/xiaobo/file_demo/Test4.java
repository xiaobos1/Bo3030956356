package com.xiaobo.file_demo;

public class Test4 {
    //纪录总瓶数
    public static int toNumber;
    //记录剩余空瓶
    public static int nullBottles;
    //
    public static int closures; //记录瓶盖
    public static void main(String[] args) {
        buy(10);
    }
    public static void buy(int money){

        int buyNumber=money>>1;
        toNumber +=buyNumber;

        //把瓶盖换算成钱
        nullBottles +=buyNumber;
        closures +=buyNumber;

        int newMoney =nullBottles>>1;
        nullBottles=nullBottles>>1;
       newMoney +=(closures=closures>>2);

       buy(newMoney);
    }
}
