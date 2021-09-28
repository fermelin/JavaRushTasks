package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int amount = Integer.parseInt(reader.readLine());
        if (amount <= 0)
            return;

        int number = Integer.parseInt(reader.readLine());
        int maximum = number;
        for (int i = 1; i < amount; i++) {
            number = Integer.parseInt(reader.readLine());
           if (number > maximum)
               maximum = number;
        }



        System.out.println(maximum);
    }
}
