package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
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
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.replaceAll("\\p{Punct}", ""));
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
