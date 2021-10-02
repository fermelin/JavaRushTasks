package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        try {
            while (true) {
                line = reader.readLine();
                FileReader fileReader = new FileReader(line);
                fileReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(line);
        } catch (Exception e) {
            e.getCause();
        }
    }
}
