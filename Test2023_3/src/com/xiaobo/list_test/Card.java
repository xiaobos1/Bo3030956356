package com.xiaobo.list_test;

public class Card {
    private String color;
    private String number;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index;

    public Card() {
    }

    public Card(String color, String number,int index) {
        this.color = color;
        this.number = number;
        this.index=index;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return(color+number);
    }
}
