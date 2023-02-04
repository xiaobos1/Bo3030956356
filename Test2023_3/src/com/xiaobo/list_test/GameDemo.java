package com.xiaobo.list_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDemo {
    public static List<Card> cards = new ArrayList<>();

    //初始化牌数据
    static {
        //定义花色数组
        String[] color = {"♥", "♠", "♣", "♦"};
        //定义数字数组
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        //花色数字组合
        int index = 0; //记录大小用于判断
        for (String s : num) {
            for (String c : color) {
                Card cd = new Card(c, s, index);
                cards.add(cd);
            }
                index++;
        }
            //添加大小王
            Card w1 = new Card("", "大🃏", ++index);
            Card w2 = new Card("", "小🃏", ++index);

            Collections.addAll(cards, w1, w2);
    }

        public static void main(String[] args){
            //打乱集合
          Collections.shuffle(cards);
//        System.out.println(cards);

            //创建玩家集合
            List<Card> linghuchong = new ArrayList<>();
            List<Card> cheyouchehang = new ArrayList<>();
            List<Card> DJashui = new ArrayList<>();

            for (int i = 0; i < cards.size() - 3; i++) {
                Card c = cards.get(i);
                //%3 0 1 2 取余数不同分牌给人
                if (i % 3 == 0) {
                    linghuchong.add(c);
                } else if (i % 3 == 1) {
                    cheyouchehang.add(c);
                } else {
                    DJashui.add(c);
                }
            }
            //subList截取最后三张牌当底牌
            List<Card> floorNumber = cards.subList(cards.size() - 3, cards.size());

            sortCards(linghuchong);
            sortCards(cheyouchehang);
            sortCards(floorNumber);
            sortCards(DJashui);

            System.out.println("-------------------底牌是：" + floorNumber + "----------");
            System.out.println("令狐冲："+linghuchong);
            System.out.println("车友车行："+cheyouchehang);
            System.out.println("小水："+DJashui);

            //排序

        }

        private static void sortCards (List<Card> cards) {
            Collections.sort(cards, new Comparator<Card>() {
                @Override
                public int compare(Card o1, Card o2) {
                    return o1.getIndex() - o2.getIndex();
                }
            });
        }

//    public static void Print(List<Card> cards){
//        for (Card card : cards) {
//            System.out.println("花色"+card.getColor());
//            System.out.println("数字"+card.getNumber());
//        }
//    }
}


