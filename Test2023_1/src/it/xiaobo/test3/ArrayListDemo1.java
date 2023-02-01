package it.xiaobo.test3;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建一个集合存储学生的成绩
        ArrayList<Integer> score=new ArrayList<>();
        score.add(89);
        score.add(79);
        score.add(69);
        score.add(59);
        score.add(99);
        score.add(88);
        score.add(86);
        score.add(81);
        score.add(80);
        System.out.println(score);

//        //删除低于80分的成绩
//        //有问题的代码，ArrayList会自动减小并且元素会移动
//        for (int i = 0; i < score.size(); i++) {
//            Integer n=score.get(i);
//            if(n<80){
//                score.remove(i);
//                //i回退防止跳过元素
//                i--;
//            }
//        }
        //倒着遍历
        for (int i =score.size()-1; i >=0; i--) {
            int m=score.get(i);
            if(m<80){
                score.remove(i);
            }
        }

        System.out.println(score);

    }
}
