package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int amount = 5;
        int[] arrInt = new int[amount];
        for (int i = 0; i < amount; i++) {
            arrInt[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = amount - 1; i != 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arrInt[j] > arrInt[j + 1]) {
                    int tmp = arrInt[j];
                    arrInt[j] = arrInt[j + 1];
                    arrInt[j + 1] = tmp;
                }
            }
        }
        for (int i : arrInt) {
            System.out.println(i);
        }
    }
}
