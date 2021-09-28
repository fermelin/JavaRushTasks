package com.javarush.task.task04.task0417;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int num = 0;

        if (a == b && b == c) {
            System.out.println(a + " " + a + " " + a);
        } else if ((num = a) == b || (num = a) == c || (num = b) == c) {
            System.out.println(num + " " + num);
        }



    }
}