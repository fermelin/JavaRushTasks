package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            reader.close();
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(line);
                System.out.println(stringBuilder.reverse().toString());
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.getCause();
        }
    }
}
