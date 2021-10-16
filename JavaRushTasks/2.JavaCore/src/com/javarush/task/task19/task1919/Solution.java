package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        try {
            FileReader fileReader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(" ");
                double sum = map.getOrDefault(strings[0], 0d);
                map.put(strings[0], sum + Double.parseDouble(strings[1]));
            }
            bufferedReader.close();
            List<String> keysSorted = new ArrayList<>(map.keySet());
            keysSorted.sort(Comparator.naturalOrder());
            for (String key : keysSorted) {
                System.out.println(key + " " + map.get(key));
            }

        } catch (Exception e) {
            e.getCause();
        }
    }
}
