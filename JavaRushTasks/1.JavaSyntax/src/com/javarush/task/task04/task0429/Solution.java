package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrInt = new int[3];
        for (int i = 0; i < 3; i++) {
            arrInt[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < 3; i++) {
            if (arrInt[i] > 0) {
                positive++;
            } else if (arrInt[i] < 0) {
                negative++;
            }
        }
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }
}
