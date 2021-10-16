package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/

public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) {
                    count++;
                    removeRectangleFromArray(a, i, j);
                }
            }
        }
        return count;
    }
    private static void removeRectangleFromArray(byte[][] source, int i, int j) {
        for (int i1 = i; i1 < source.length && source[i1][j] != 0; i1++) {
            for (int j1 = j; j1 < source[0].length && source[i1][j1] != 0; j1++) {
                source[i1][j1] = 0;
            }
        }
    }
}
