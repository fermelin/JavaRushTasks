package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("мама");
        arrStr.add("мыла");
        arrStr.add("раму");
        arrStr.add(1, "именно");
        arrStr.add(3, "именно");
        arrStr.add(5, "именно");
        for (String s : arrStr) {
            System.out.println(s);
        }
    }
}
