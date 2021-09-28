package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private Human mother;
        private Human father;
        private int arms;

        public Human(String name) {}
        public Human(String name, int age) {}
        public Human(int age) {}
        public Human(boolean sex) {}
        public Human(Human mother) {}
        public Human(Human father, Human mother) {}
        public Human(int arms, boolean age) {}
        public Human(String name, int age, boolean sex) {}
        public Human(String name, int age, boolean sex, int arms) {}
        public Human(String name, int age, boolean sex, int arms, Human father) {}

    }

}
