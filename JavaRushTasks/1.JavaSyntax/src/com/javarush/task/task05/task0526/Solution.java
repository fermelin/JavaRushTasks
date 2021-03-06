package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("dude", 11, "there");
        Man man2 = new Man("dude2", 221, "there");
        Woman woman1 = new Woman("msdude2", 221, "there");
        Woman woman2 = new Woman("msdude2", 221, "there");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }


    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man() {
            this.name = "noname";
            this.age = 1;
        }
        public Man(String name) {
            this.name = name;
        }
        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman() {
            this.name = "noname";
            this.age = 1;
        }
        public Woman(String name) {
            this.name = name;
        }
        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
