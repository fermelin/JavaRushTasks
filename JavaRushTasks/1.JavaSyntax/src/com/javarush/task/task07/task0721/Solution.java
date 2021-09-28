package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int maximum;
        int minimum;

        int[] arrInt = getInts();
        maximum = minimum = arrInt[0];
        for (int i = 1; i < 20; i++) {
            if (maximum < arrInt[i]) {
                maximum = arrInt[i];
            }
            if (minimum > arrInt[i]) {
                minimum = arrInt[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws  IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrInt = new int[20];
        for (int i = 0; i < 20; i++) {
            arrInt[i] = Integer.parseInt(reader.readLine());
        }
        return arrInt;
    }
}
