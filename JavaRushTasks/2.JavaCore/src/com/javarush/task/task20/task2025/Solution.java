package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Алгоритмы-числа
*/

public class Solution {

    public static long[] getNumbers(long N) {
        ArrayList<Long> result = new ArrayList<>();
        long[][] buffer = new long[20][10];
        for (int i = 0; i < 10; i++) {
            buffer[1][i] = i;
        }
        for (int i = 2; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                buffer[i][j] = j * buffer[i - 1][j];
            }
        }
        if (N < 1) {
            return new long[0];
        }
        for (long number = 1; number < N; number++) {
            long operationalNum = number;
            long element = number;
            int size = Long.toString(number).length();
            while (operationalNum > 0) {
                element -= buffer[size][(int)(operationalNum % 10)];
                operationalNum /= 10;
            }
            if (element == 0) {
                result.add(number);
            }
        }
        long[] array = new long[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Integer.MAX_VALUE / 10)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
