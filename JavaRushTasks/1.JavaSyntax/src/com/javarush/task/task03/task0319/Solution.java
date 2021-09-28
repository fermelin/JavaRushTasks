package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }
}
