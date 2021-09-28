package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String message = "";
        if (o instanceof Cat) {
            message = "Кошка";
        }else if (o instanceof Dog) {
            message = "Собака";
        }else if (o instanceof Bird) {
            message = "Птица";
        }else if (o instanceof Lamp) {
            message = "Лампа";
        }
        System.out.println(message);
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
