package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(args[0]);
            Map<Character, Integer> map = new HashMap<>();
            char[] buffer = new char[1024];
            int lengthRead;
            while ((lengthRead = fileReader.read(buffer)) > 0) {
                for (int i = 0; i < lengthRead; i++) {
                    int count = map.getOrDefault(buffer[i], 0) + 1;
                    map.put(buffer[i], count);
                }
            }
            fileReader.close();
            ArrayList<Character> list = new ArrayList<>(map.keySet());
            list.sort(Comparator.naturalOrder());
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%c %d\n", list.get(i), map.get(list.get(i)));
            }
        } catch (Exception e) {
        }
    }
}
