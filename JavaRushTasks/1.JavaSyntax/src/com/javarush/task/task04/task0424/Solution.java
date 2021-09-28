package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrInt = new int[3];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            arrInt[i] = Integer.parseInt(bufferedReader.readLine());
        }
        if (arrInt[0] == arrInt[1] && arrInt[1] != arrInt[2])
            System.out.println(3);
        else if (arrInt[0] == arrInt[2] && arrInt[0] != arrInt[1])
            System.out.println(2);
        else if (arrInt[1] == arrInt[2] && arrInt[2] != arrInt[0])
            System.out.println(1);

    }
}
