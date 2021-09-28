package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        int result = 0;

        if ((a >= b && b >= c) || (c >= b && b >= a))
            result = b;
        else if ((b >= a && a >= c) || (c >= a && a >= b))
            result = a;
        else
            result = c;
        System.out.println(result);

    }
}
