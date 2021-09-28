package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            String line;
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            while (true) {
                line = reader.readLine();
                writer.write(line);
                if (!line.equals("exit")) {
                    writer.newLine();
                } else {
                    break;
                }
            }
            writer.close();
            reader.close();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
