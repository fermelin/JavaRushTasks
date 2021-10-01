package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            reader.close();
            InputStream inputStream = new FileInputStream(fileName);
            int comma = (int)',';
            int count = 0;
            while (inputStream.available() > 0) {
                int symbol = inputStream.read();
                if (symbol == comma) {
                    count++;
                }
            }
            inputStream.close();
            System.out.println(count);
        } catch (Exception e) {}
    }
}
