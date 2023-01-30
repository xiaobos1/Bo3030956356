package it.xiaobo.test2;

public class Cylinder {
    //半径
    private double radius;


    public Cylinder(){}

    public Cylinder(double radius){
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area(){
        return radius*radius*3.14;
    }

}
