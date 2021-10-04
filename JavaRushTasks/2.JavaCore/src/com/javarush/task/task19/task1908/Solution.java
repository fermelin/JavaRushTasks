package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            reader.close();

            FileReader fileReader = new FileReader(fileName1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(fileName2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            boolean isNotFirstWord = false;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(" ");
                for (int i = 0; i < strings.length; i++) {
                    try {
                        int num = Integer.parseInt(strings[i]);
                        if (isNotFirstWord) {
                            bufferedWriter.append(" ");
                        }
                        bufferedWriter.append(Integer.toString(num));
                        isNotFirstWord = true;

                    } catch (NumberFormatException e) {}
                }
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception e) {
            e.getCause();
        }
    }
}
