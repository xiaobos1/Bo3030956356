package it.xiaobo.test2;

public class Film {
    private String name;
    private double score;
    private String actor;

    //无参构造
   public Film(){}
    //有参构造
    public Film(String name,double score,String actor) {
        this.name=name;
        this.score = score;
        this.actor=actor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public String getActor() {
        return actor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        System.out.println("《"+name+"》，"+score+","+actor);
        return null;
    }
}
