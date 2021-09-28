package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        arrayList.add(reader.readLine());
        int maxLenght = arrayList.get(0).length();
        int minLenght = maxLenght;
        for (int i = 1; i < 10; i++) {
            arrayList.add(reader.readLine());
            int len = arrayList.get(i).length();
            if (maxLenght < len) {
                maxLenght = len;
            }
            if (minLenght > len) {
                minLenght = len;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arrayList.get(i).length() == maxLenght ||
            arrayList.get(i).length() == minLenght) {
                System.out.println(arrayList.get(i));
                return;
            }
        }


    }
}
