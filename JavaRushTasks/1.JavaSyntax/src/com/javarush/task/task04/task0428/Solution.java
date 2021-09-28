package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrInt = new int[3];
        for (int i = 0; i < 3; i++) {
            arrInt[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (arrInt[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
