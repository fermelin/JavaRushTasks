package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add("String number " + i);
        }
        System.out.println(arrayList.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
