package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[4];
        for (int i = 0; i < 4; i++) {
            arrayInt[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int maxNum = arrayInt[0];
        for (int i = 1; i < 4; i++) {
            if (maxNum < arrayInt[i]) {
                maxNum = arrayInt[i];
            }
        }
        System.out.println(maxNum);

    }
}
