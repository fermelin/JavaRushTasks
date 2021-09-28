package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        if (number == 0) {
            System.out.println("ноль");
            return;
        }
        String sign = number > 0 ? "положительное" : "отрицательное";
        String parity = number % 2 == 0 ? "четное": "нечетное";
        System.out.println(sign + " " + parity + " число");

    }
}
