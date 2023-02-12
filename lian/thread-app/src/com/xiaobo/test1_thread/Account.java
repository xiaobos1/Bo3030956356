package com.xiaobo.test1_thread;

public class Account {

    private String cardId;
    private double money;  //账户的余额


    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }


    /**
     * 获取
     * @return cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置
     * @param cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "Account{cardId = " + cardId + ", money = " + money + "}";
    }

    public void drawMoney(double money) {
       String name= Thread.currentThread().getName();


       //同步代码块
        //判断账户钱够不够
        synchronized (this) {
            if(this.money>=money){
                System.out.println(name+"来取钱成功，吐出："+money);
                this.money -=money;
                System.out.println(name+"取钱后剩余："+this.money);
            }else{
                System.out.println(name+"来取钱，余额不足");
            }
        }
    }
}
