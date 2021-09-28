package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String snumber = bufferedReader.readLine();
        int number = Integer.parseInt(snumber);
        if (number > 0)
            System.out.println(number * 2);
        else if (number < 0)
            System.out.println(number + 1);
        else
            System.out.println(0);

    }

}