package it.xiaobo.test2;

public class Test2 {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder(2.33);

        double area=cy.area();

        System.out.println(String.format("%.2f",area));
    }
}
