package com.javarush.task.task18.task1822;

import java.io.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = nameReader.readLine();
            nameReader.close();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int intID = Integer.parseInt(args[0]);
            String line;
            while ((line = reader.readLine()) != null) {
                int currId = Integer.parseInt(line.substring(0, line.indexOf(" ")));
                if (currId == intID) {
                    System.out.println(line);
                    break;
                }
            }
            reader.close();
        } catch (Exception e) {
            e.getCause();
        }

    }
}
