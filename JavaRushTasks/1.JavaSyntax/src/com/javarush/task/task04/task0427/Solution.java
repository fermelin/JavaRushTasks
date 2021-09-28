package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());

        if (number < 1 || number > 999)
            return;
        String parity = number % 2 == 0 ? "четное" : "нечетное";
        String digits;
        if (Integer.toString(number).length() == 1) {
            digits = "однозначное";
        } else if (Integer.toString(number).length() == 2) {
            digits = "двузначное";
        } else {
            digits = "трехзначное";
        }
        System.out.println(parity + " " + digits + " число");

    }
}
