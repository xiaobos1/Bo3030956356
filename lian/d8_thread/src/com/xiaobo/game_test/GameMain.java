package com.xiaobo.game_test;

import javax.swing.*;

public class GameMain {
    //定义窗口的宽度和高度
    public static final int WIDTH=600;
    public static final int HEIGHT=800;

    public static void main(String[] args) {
        //创建一个窗口函数
        JFrame jFrame=new JFrame("飞机大战");

        //设置窗口大小
        jFrame.setSize(WIDTH,HEIGHT);

        //关闭窗口后JVM终止运行 EXIT_ON_CLOSE=3
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置窗口居中
        jFrame.setLocationRelativeTo(null) ;
        //是否显示窗口
        jFrame.setVisible(true);




    }
}
