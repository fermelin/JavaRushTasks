package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arrayInt.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> arrIntThree = new ArrayList<>();
        ArrayList<Integer> arrIntTwo = new ArrayList<>();
        ArrayList<Integer> arrIntOthers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = arrayInt.get(i);
            if (num % 3 == 0 || num % 2 == 0) {
                if (num % 3 == 0) {
                    arrIntThree.add(num);
                }
                if (num % 2 == 0) {
                    arrIntTwo.add(num);
                }
            } else {
                arrIntOthers.add(num);
            }
        }
        printList(arrIntThree);
        printList(arrIntTwo);
        printList(arrIntOthers);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
