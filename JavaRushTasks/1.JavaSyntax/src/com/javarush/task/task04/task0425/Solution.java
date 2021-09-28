package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        int ret = 0;
        if (a > 0 && b > 0) {
            ret = 1;
        } else if (a < 0 && b > 0) {
            ret = 2;
        } else if (a < 0 && b < 0) {
            ret = 3;
        } else if (a > 0 && b < 0) {
            ret = 4;
        }

        if (ret != 0) {
            System.out.println(ret);
        }

    }
}
