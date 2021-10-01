package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        try {
            fileName = reader.readLine();
            reader.close();
            InputStream inputStream = new FileInputStream(fileName);
            while (inputStream.available() > 0) {
                int symbol = inputStream.read();
                set.add(symbol);
            }
            inputStream.close();
            list.addAll(set);
            list.sort(Comparator.naturalOrder());

            StringBuilder stringBuilder = new StringBuilder();
            for (Integer i : list) {
                stringBuilder.append(i).append(" ");
            }
            System.out.println(stringBuilder.toString().trim());
        } catch (Exception e) {}

    }
}
