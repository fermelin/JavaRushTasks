package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrInt = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arrInt[i] = Integer.parseInt(reader.readLine());
        }
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        for (int i = 10; i < 20; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
