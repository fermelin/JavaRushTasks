package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }
}
