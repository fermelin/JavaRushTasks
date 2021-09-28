package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        int g = 0;
        while (g < 10) {
            arrInt[g] = g + 1;
            g++;
        }
        int i = 0;
        int j;
        while (i < 10) {
            j = 0;
            while (j < 10) {
                System.out.print(arrInt[j] * (i + 1));
                if (j != 9) {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
