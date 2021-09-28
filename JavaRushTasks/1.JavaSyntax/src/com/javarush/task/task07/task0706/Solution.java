package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arrInt = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            arrInt[i] = Integer.parseInt(reader.readLine());
        }
        int evenAmount = 0;
        int oddAmount = 0;
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                evenAmount += arrInt[i];
            } else {
                oddAmount += arrInt[i];
            }
        }
        if (evenAmount == oddAmount)
            return;
        String message = evenAmount > oddAmount ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(message);
    }
}
