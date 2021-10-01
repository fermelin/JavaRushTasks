package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            fileName = reader.readLine();
            reader.close();
            InputStream inputStream = new FileInputStream(fileName);
            int minByte = inputStream.read();
            while (inputStream.available() > 0) {
                int symbol = inputStream.read();
                if (symbol < minByte) {
                    minByte = symbol;
                }
            }
            inputStream.close();
            System.out.println(minByte);
        } catch (Exception e) {}

    }
}
