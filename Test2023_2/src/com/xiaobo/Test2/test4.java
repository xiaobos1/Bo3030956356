package com.xiaobo.Test2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
  目标：通过GUI编程 理解匿名内部类的真实使用
 */
public class test4 {
    public static void main(String[] args) {
        //创建窗口
        JFrame win =new JFrame("登陆界面");
        JPanel panel=new JPanel();
        win.add(panel);
        //创建一个按钮对象
        JButton btn=new JButton("登录");

        //匿名内部类的
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"爱我就点我");
            }
        });

        //把按钮添加到桌布
        panel.add(btn);

        //展示窗口
        win.setSize(400,200);
        win.setLocationRelativeTo(null);
        win.setVisible(true);

    }
}
