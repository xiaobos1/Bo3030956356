package it.xiaobo.test4;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static sun.security.jgss.GSSUtil.login;

public class AtmSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义用户类
        ArrayList<UserCard> card = new ArrayList<>();
        System.out.println(getRandomCard(card));
        while (true) {
            //系统首页展示
            System.out.println("============ ATM系统 ======================");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            System.out.println("输入你的操作");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    login(card,sc);
                    break;
                case 2:
                    beginCard(card, sc);
                    break;
                default :
                    print(card);
                    break;
            }
        }
    }

    private static void login(ArrayList<UserCard> card,Scanner sc) {
        System.out.println("============== 登录功能 ================");
        if (card.size() == 0) {
            System.out.println("当前没有账户，请开户再来");
            return;
        }
        boolean f1=true;
        while (f1){
            System.out.println("输入你的卡号：");
            String cardId = sc.next();
            boolean flag = CardReside(card, cardId);
            if (flag) {
                boolean f=true;
                while(f) {
                    System.out.println("输入你的密码：");
                    String password = sc.next();
                    UserCard user=getUserCard(card,cardId);
                    if(user.getPassword().equals(password)){
                        System.out.println("登录成功");
                        function(card,user);
                        return;
                    }else{
                        System.out.println("密码不正确请重新输入");
                    }
                    //判断密码是否正确
//                    for(UserCard u:card){
//                        if(u.getCardId().equals(cardId)&&u.getPassword().equals(password)){
//                            System.out.println("登录成功");
//                            //功能
//                            function(card,cardId);
//                            f=false;
//                            f1=false;
//                        }else{
//                            System.out.println("密码不正确请重新输入");
//                        }
                    //}

                }
            }else {
                System.out.println("卡号不正确");
            }
    }



    }

    //功能界面
    private static void function(ArrayList<UserCard> card,UserCard user) {
        Scanner  s=new Scanner(System.in);
        boolean f=true;
        while(f){
            System.out.println("============= 功能界面 ===================");
            System.out.println("============= 1.存钱 ===================");
            System.out.println("============= 2.取钱 ===================");
            System.out.println("============= 3.转账 ===================");
            System.out.println("============= 4.查看 ===================");
            System.out.println("============= 5.退出 ===================");
            System.out.println("选择你的功能：");
            int index=s.nextInt();
            switch(index){
                case  1:
                    setMoney(card,user);
                    break;
                case 2:
                    getMoney(card,user);
                    break;
                case 3:
                    //转账
                    meToYouMoney(card,user);
                    break;
                case 4:
                    SeeMoney(user);
                   break;
                case 5:
                    f=false;
                    break;
                default:
                    System.out.println("操作不对哟~~~");
            }

        }
    }

    private static void meToYouMoney(ArrayList<UserCard> card, UserCard user) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要转账的卡号");
        String cardId1=sc.next();
        //判断卡号是否存在
        boolean b= CardReside(card,cardId1);
        //转账功能
        UserCard you=getUserCard(card,cardId1);
        if(b) {
            while (true) {
                System.out.println("输入你转账的金额：");
                double mon = sc.nextDouble();
                //判断金额是否超出
                if (mon > user.getMoney()) {
                    System.out.println("金额超出你的总金额");
                } else {
                    //自己减少 、别人增加

                    //别人之前的总金额
                    double b1 = you.getMoney();
                    //自己之前的总金额
                    double b2 = user.getMoney();

                    //别人增加
                    you.setMoney(b1 + mon);

                    //自己减少
                    user.setMoney(b2 -mon);

                    System.out.println("转账完成");
                    SeeMoney(user);
                    return;
                }
            }
        }
    }

    //查看余额
    public static void SeeMoney( UserCard user){
        //将余额展示
        System.out.println("============查看===============");
        System.out.println("户主:"+user.getUserName());
        System.out.println("卡号:"+user.getCardId());
        System.out.println("余额:"+user.getMoney());
        System.out.println("每次限额："+user.getQuotaMoney());
    }
    //功能2 --- 取钱
    private static void getMoney(ArrayList<UserCard> card,UserCard user) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            SeeMoney(user);
            if(user.getMoney()==0){
                System.out.println("当前还没有存钱，请存钱后再来");
                return;
            }
            System.out.println("输入你取出的金额：");
            double money = sc.nextDouble();
            //判断取出金额是否大于余额
            if (money > user.getMoney()){
                System.out.println("余额不足");
            }else{
                 //当存款大于等于可取出，判断是否超出当次最多取出
                if(money>user.getQuotaMoney()){
                    System.out.println("错误，当前金额大于当次可取出最大金额");
                }else{
                      System.out.println("取钱成功");
                      double newMoney=user.getMoney()-money;
                      user.setMoney(newMoney);
                      return;
                     }
                }




//                double b=0;
//                for(UserCard u:card){
//                    if(u.getCardId().equals(cardId)){
//                        b=u.getQuotaMoney();
//                    }
//                }
//                if(money>b){
//                    System.out.println("错误，当前金额大于当次可取出最大金额");
//                }else{
//                    System.out.println("取钱成功");
//                    for(UserCard c:card){
//                        if(c.getCardId().equals(cardId)){
//                            double newMoney=m1-money;
//                            c.setMoney(newMoney);
//                            return;
//                        }
//                    }
//                }
            }
    }

    //功能1 --- 存钱
    private static void setMoney(ArrayList<UserCard> card,UserCard user) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你存入的金额：");
        double money=sc.nextDouble();
        //之前剩余的钱保存下来
        double g=user.getMoney();
        //总存钱数等于 本次存钱+之前存款
        user.setMoney(g+money);
//        //遍历集合找到cardId，将money存入对象中
//        for(UserCard u:card){
//            if(u.getCardId().equals(cardId)){
//                u.setMoney(money);
//            }
//        }
        System.out.println("存钱成功");

    }

    //开户操作
    public static void beginCard(ArrayList<UserCard> card, Scanner sc) {
        //创建UserCard对象
        UserCard u = new UserCard();
        System.out.println("=============== 开户操作 =======================");
        System.out.println("输入账户用户名：");
        String name = sc.next();
        u.setUserName(name);
        //判断密码是否正确
        while (true) {
            System.out.println("输入账户密码：");
            String p1=sc.next();
            System.out.println("再次确认密码:");
            String p2=sc.next();
            if(p1.equals(p2)){
                u.setPassword(p1);
                break;
            }else{
                System.out.println("密码错误，请重新输入");
            }

        }
        System.out.println("输入账户当日限额：");
        double qoMoney=sc.nextDouble();
        u.setQuotaMoney(qoMoney);

        String cardId="";
        //获得随机卡号
        while(true){
            cardId=getRandomCard(card);
            boolean flag=CardReside(card,cardId);
            if(!flag){
                u.setCardId(cardId);
                break;
            }
        }
        card.add(u);
        System.out.println("恭喜尊敬的账户:"+name+",开通本ATM系统，并获得卡号:"+cardId);

    }

    //生成8位的密码
    private static String getRandomCard(ArrayList<UserCard> card) {
        String str="";
        Random r=new Random();
        //生成8位数字
            for (int i = 0; i < 8; i++) {
                int c = r.nextInt(10);
                str += c;
            }
        return str;
    }

    //判断卡号是否存在
    public static boolean CardReside(ArrayList < UserCard > card, String cardId){
            for (UserCard c : card) {
                String p = c.getCardId();
                if (p.equals(cardId)) {
                    return true;
                }
            }
            return false;
        }



    //打印方法
    public static void print(ArrayList<UserCard> c){
        System.out.println("卡号\t\t\t用户名\t密码\t\t\t当日限用金额\t总金额");
        for(UserCard u:c){
            System.out.println(u.getCardId()+"\t"+u.getUserName()+"  "+u.getPassword()+"\t"+u.getQuotaMoney()+"\t"+u.getMoney() );
        }
    }

    //找到对象
    public static UserCard getUserCard(ArrayList < UserCard > card, String cardId){
        for (UserCard u:card){
            if(u.getCardId().equals(cardId)){
                return u;
            }
        }
        return null;
    }






}

