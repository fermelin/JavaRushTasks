package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        try {
            FileReader fileReader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            double maxSum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(" ");
                double sum = map.getOrDefault(strings[0], 0d) + Double.parseDouble(strings[1]);
                if (maxSum < sum) {
                    maxSum = sum;
                }
                map.put(strings[0], sum);
            }
            bufferedReader.close();
            List<String> keysSorted = new ArrayList<>(map.keySet());
            keysSorted.sort(Comparator.naturalOrder());
            for (String key : keysSorted) {
                if (maxSum == map.get(key)) {
                    System.out.println(key);
                }
            }

        } catch (Exception e) {
            e.getCause();
        }

    }
}
