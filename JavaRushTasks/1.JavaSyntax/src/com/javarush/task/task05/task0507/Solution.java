package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int amount = 0;
        int sum = 0;
        while (true) {
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number == -1) {
                System.out.println((double)sum / (double)amount);
                return;
            }
            sum += number;
            amount++;
        }
    }
}

