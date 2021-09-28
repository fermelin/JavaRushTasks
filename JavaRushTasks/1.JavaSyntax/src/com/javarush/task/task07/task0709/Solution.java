package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        arrayList.add(reader.readLine());
        int minLength = arrayList.get(0).length();
        for (int i = 1; i < 5; i++) {
            arrayList.add(reader.readLine());
            if (minLength > arrayList.get(i).length()) {
                minLength = arrayList.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (arrayList.get(i).length() == minLength) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
