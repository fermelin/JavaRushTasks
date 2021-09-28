package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int longestStr = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length() > longestStr) {
                longestStr = strings.get(i).length();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == longestStr) {
                System.out.println(strings.get(i));
            }
        }
    }
}
