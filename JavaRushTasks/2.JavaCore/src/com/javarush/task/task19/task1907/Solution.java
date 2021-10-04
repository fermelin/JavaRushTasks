package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    private static final String pattern = "world";
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            reader.close();
            FileReader fileReader = new FileReader(fileName);
            int count = 0;
            BufferedReader fileBufferedReader = new BufferedReader(fileReader);
            String line;
            char[] patternToCheck = new char[pattern.length() + 2];
            while ((line = fileBufferedReader.readLine()) != null) {
                int from = 0;
                while ((from = line.indexOf(pattern, from)) != -1) {
                    if ((from != 0 && Character.isLetter(line.charAt(from - 1))) ||
                            (from + pattern.length() < line.length() && Character.isLetter(line.charAt(from + pattern.length())))) {
                        from++;
                        continue;
                    }
                    from++;
                    count++;
                }
            }
            fileBufferedReader.close();
            System.out.println(count);
        } catch (Exception e) {
            e.getCause();
        }
    }
}
