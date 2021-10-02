package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/


public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            reader.close();
            FileReader fileReader1 = new FileReader(fileName1);
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[1024];
            int lengthRead;
            while ((lengthRead = fileReader1.read(buffer)) > 0) {
                stringBuilder.append(buffer, 0, lengthRead);
            }
            fileReader1.close();

            FileWriter fileWriter1 = new FileWriter(fileName1);
            FileReader fileReader2 = new FileReader(fileName2);
            while ((lengthRead = fileReader2.read(buffer)) > 0) {
                fileWriter1.write(buffer, 0, lengthRead);
            }
            fileWriter1.write(stringBuilder.toString());
            fileWriter1.close();
            fileReader2.close();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
