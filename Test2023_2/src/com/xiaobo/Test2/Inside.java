package com.xiaobo.Test2;

public class Inside {

    //静态内部类
    public static class TheInside{
        private String name;
        public static int people;

        public TheInside(){}

        public TheInside(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getPeople() {
            return people;
        }

        public static void setPeople(int people) {
            TheInside.people = people;
        }
    }
}
