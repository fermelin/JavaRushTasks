package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            reader.close();
            if (args[0].equals("-c")) {
                create(fileName, args[1], args[2], args[3]);
            }
        } catch (Exception e) {
            e.getCause();
        }

    }

    private static void create(String fileName, String productName, String price, String quantity) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        char[] buffer = new char[51];
        int maxID = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            int id = Integer.parseInt(line.substring(0, 8).trim());
            if (maxID < id) {
                maxID = id;
            }
        }
        fileReader.close();
        FileWriter fileWriter = new FileWriter(fileName, true);
        String str = String.format("%-8d%-30.30s%-8.8s%-4.4s", ++maxID, productName, price, quantity);

        fileWriter.write('\n');
        fileWriter.write(str);
        fileWriter.flush();
        fileWriter.close();
    }
}
