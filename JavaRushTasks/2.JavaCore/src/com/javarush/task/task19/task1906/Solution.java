package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            reader.close();
            FileReader fileReader = new FileReader(fileName1);
            FileWriter fileWriter = new FileWriter(fileName2);

            char[] buffer = new char[1024];
            StringBuilder stringBuilder = new StringBuilder();
            int lengthRead;
            int indexNumber = 1;
            while ((lengthRead = fileReader.read(buffer)) > 0) {
                for (int i = 0; i < lengthRead; i++) {
                    if (indexNumber % 2 == 0) {
                        stringBuilder.append(buffer[i]);
                    }
                    indexNumber++;
                }
            }
            fileReader.close();
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();

        } catch (Exception e) {
            e.getCause();
        }
    }
}
