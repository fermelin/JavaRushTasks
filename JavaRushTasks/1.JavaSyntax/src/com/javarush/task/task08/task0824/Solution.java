package com.javarush.task.task08.task0824;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human children1 = new Human("ch1", true, 7, new ArrayList<>());
        Human children2 = new Human("ch2", false, 7, new ArrayList<>());
        Human children3 = new Human("ch3", true, 7, new ArrayList<>());
        ArrayList<Human> childrenList = new ArrayList<>();
        childrenList.add(children1);
        childrenList.add(children2);
        childrenList.add(children3);
        Human mother = new Human("mother", false, 40, childrenList);
        Human father = new Human("father", true, 40, childrenList);
        ArrayList<Human> motherInList = new ArrayList<>();
        ArrayList<Human> fatherInList = new ArrayList<>();
        motherInList.add(mother);
        fatherInList.add(father);
        Human gf1 = new Human("gf1", true, 70, motherInList);
        Human gf2 = new Human("gf2", true, 70, fatherInList);
        Human gm1 = new Human("gm1", false, 70, motherInList);
        Human gm2 = new Human("gm2", false, 70, fatherInList);

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
    }

    public static class Human {
         String name;
         boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
