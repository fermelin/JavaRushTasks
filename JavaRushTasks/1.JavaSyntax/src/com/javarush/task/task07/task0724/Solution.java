package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfa1 = new Human("gf1", true, 70);
        Human grandfa2 = new Human("gf2", true, 70);
        Human grandma1 = new Human("gm1", false, 70);
        Human grandma2 = new Human("gm2", false, 70);
        Human father = new Human("fa", true, 70,grandfa1,grandma1);
        Human mother = new Human("mo", true, 70,grandfa2,grandma2);
        Human child1 = new Human("ch1", true, 70,father,mother);
        Human child2 = new Human("ch2", false, 70,father,mother);
        Human child3 = new Human("ch3", true, 70,father,mother);

        System.out.println(grandfa1);
        System.out.println(grandfa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}