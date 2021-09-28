package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int size = 3;
        int[] arrayInt = new int[size];

        for (int i = 0; i < size; i++) {
            arrayInt[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int tmp;
        for (int i = size - 1; i != 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayInt[j] < arrayInt[j + 1]) {
                    tmp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arrayInt[i]);
            if (i + 1 != size) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
