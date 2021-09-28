package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double t = Double.parseDouble(bufferedReader.readLine());
        String color;
        if (t % 5.0 >= 0.0 && t % 5.0 < 3.0) {
            color = "зеленый";
        } else if (t % 5 > 2.9999 && t % 5 < 4.0) {
            color = "желтый";
        } else {
            color = "красный";
        }
        System.out.println(color);


    }
}