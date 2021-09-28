package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minimum = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (minimum > array.get(i)) {
                minimum = array.get(i);
            }
        }
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
