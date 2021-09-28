package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int ourScore = 0;
        int anotherCatScore = 0;
        if (this.age > anotherCat.age) {
            ourScore++;
        } else if (this.age < anotherCat.age) {
            anotherCatScore++;
        }
        if (this.weight > anotherCat.weight) {
            ourScore++;
        } else if (this.weight < anotherCat.weight) {
            anotherCatScore++;
        }
        if (this.strength > anotherCat.strength) {
            ourScore++;
        } else if (this.strength < anotherCat.strength) {
            anotherCatScore++;
        }
        if (ourScore > anotherCatScore) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
