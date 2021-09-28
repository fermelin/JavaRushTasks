package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int number = Integer.parseInt(bufferedReader.readLine());
        int i = 0;
        while (i < number) {
            System.out.println(str);
            i++;
        }

    }
}
