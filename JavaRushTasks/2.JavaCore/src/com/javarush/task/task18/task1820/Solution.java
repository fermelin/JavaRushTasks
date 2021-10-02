package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            FileReader fileReader = new FileReader(fileName1);
            int lengthRead;
            char[] buffer = new char[1024];
            StringBuilder stringBuilder = new StringBuilder();
            while ((lengthRead = fileReader.read(buffer)) > 0) {
                stringBuilder.append(buffer, 0, lengthRead);
            }
            fileReader.close();
            String[] sArray = stringBuilder.toString().split(" ");
            stringBuilder = null;
            long[] longArray = new long[sArray.length];
            for (int i = 0; i < sArray.length; i++) {
                longArray[i] = Math.round(Double.parseDouble(sArray[i]));
            }
            StringBuilder stringBuilder1 = new StringBuilder();
            for (int i = 0; i < longArray.length; i++) {
                stringBuilder1.append(longArray[i]).append(" ");
            }
            FileWriter fileWriter = new FileWriter(fileName2);
            fileWriter.write(stringBuilder1.toString().trim());
            fileWriter.close();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
