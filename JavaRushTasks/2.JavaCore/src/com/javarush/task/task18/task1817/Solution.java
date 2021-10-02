package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

/* 
Пробелы
*/

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            int allCount = 0;
            int spacesCount = 0;
            while ((line = reader.readLine()) != null) {
                byte[] byteSet = line.getBytes();
                for (byte b : byteSet) {
                    if (b == ' ') {
                        spacesCount++;
                    }
                    allCount++;
                }
            }
            reader.close();
            double result = (double) spacesCount / allCount * 100;
            System.out.printf("%.2f", result);
        } catch (Exception e) {
            e.getCause();
        }
    }
}
