package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {

    private static boolean isEngLetter(byte symbol) {
        return ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z'));
    }
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                byte[] byteSet = line.getBytes();
                for (byte b : byteSet) {
                    if (isEngLetter(b)) {
                        count++;
                    }
                }
            }
            reader.close();
            System.out.println(count);
        } catch (Exception e) {
            e.getCause();
        }
    }
}
