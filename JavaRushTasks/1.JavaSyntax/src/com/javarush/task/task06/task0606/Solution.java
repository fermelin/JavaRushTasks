package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());
        while (number != 0) {
            if (number % 2 == 0) {
                Solution.even++;
            } else {
                Solution.odd++;
            }
            number /= 10;
        }
        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);
    }
}
