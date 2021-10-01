package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        Map<Integer, Integer> map = new HashMap<>();
        try {
            fileName = reader.readLine();
            reader.close();
            InputStream inputStream = new FileInputStream(fileName);
            int maxCount = 0;
            while (inputStream.available() > 0) {
                int symbol = inputStream.read();
                int count = map.getOrDefault(symbol, 0) + 1;
                map.put(symbol, count);
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            inputStream.close();
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer key : map.keySet()) {
                if (map.get(key) == maxCount) {
                    stringBuilder.append(key).append(" ");
                }
            }
            System.out.println(stringBuilder.toString().trim());
        } catch (Exception e) {}
    }
}
