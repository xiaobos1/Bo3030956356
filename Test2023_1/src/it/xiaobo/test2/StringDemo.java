package it.xiaobo.test2;

public class StringDemo {
    public static void main(String[] args) {
        //String的功能API
        String name="中国我爱你love";
        //获取字符串的长度length
        System.out.println(name.length());

        //public char charAt(int i);获取某索引位置的字符
        char ch=name.charAt(1);
        System.out.println(ch);

        //public char[] toCharArray(); 把字符串转成字符数组
        char[] c=name.toCharArray();
        //增强for的方法
        for(char ci:c){
            System.out.println(ci);
        }
        //charAt
        for(int i=0;i<c.length;i++){
            char cc=c[i];
            System.out.println(cc);
        }

        //截取内容；public String substring(int beginIndex,int endIndex);
        String rs="Java是最厉害的语言";
        String rs1=rs.substring(4);
        System.out.println(rs1);
        String rs2=rs.substring(0,4);//从beginIndex索引开始往后4个
        System.out.println(rs2);


        //替换关键字
        //public String replace(charSequence target,charSequence replacement);
        String name2="马化腾是我是你爹，马化腾我是你爹";
        String name3=name2.replace("马化腾","***");
        System.out.println(name3);

        //将字符串转化为字符数组
        //public String[] split(String regex)

        String name4="贾乃亮,王宝强,陈羽凡";
        String[] n=name4.split(",");
        for (int i = 0; i < n.length; i++) {
            String str=n[i];
            System.out.println(str);
        }

    }



}
