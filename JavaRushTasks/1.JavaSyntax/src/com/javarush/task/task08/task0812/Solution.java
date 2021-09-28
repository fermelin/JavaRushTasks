package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int amount = 1;
        int maxAmount = 1;
        int number;
        int toCompare;
        list.add(toCompare = Integer.parseInt(reader.readLine()));
        for (int i = 1; i < 10; i++) {
            list.add(number = Integer.parseInt(reader.readLine()));
            if (number != toCompare) {
                toCompare = number;
                amount = 0;
            }
            amount++;
            if (maxAmount < amount) {
                maxAmount = amount;
            }
        }
        System.out.println(maxAmount);
    }
}
