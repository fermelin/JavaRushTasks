package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = reader.readLine();
            reader.close();
            switch (args[0]) {
                case "-c" :
                    create(fileName, args[1], args[2], args[3]);
                    break;
                case "-u" :
                    update(fileName, args[1], args[2], args[3], args[4]);
                    break;
                case "-d" :
                    delete(fileName, args[1]);
                    break;
            }
        } catch (Exception e) {
            e.getCause();
        }
    }
    private static void delete(String fileName, String id) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int intID = Integer.parseInt(id);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            int currId = Integer.parseInt(line.substring(0, 8).trim());
            if (currId == intID) {
                continue;
            }
            stringBuilder.append(line).append('\n');
        }
        reader.close();
        FileWriter fileWriter = new FileWriter(fileName);
        String result = stringBuilder.toString();
        fileWriter.write(result, 0, result.length() - 1);
        fileWriter.close();
    }

    private static void update(String fileName, String id, String productName, String price, String quantity) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int intID = Integer.parseInt(id);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        String strFormatted = String.format("%-8d%-30.30s%-8.8s%-4.4s", intID, productName, price, quantity);
        while ((line = reader.readLine()) != null) {
            int currId = Integer.parseInt(line.substring(0, 8).trim());
            if (currId == intID) {
                stringBuilder.append(strFormatted).append('\n');
                continue;
            }
            stringBuilder.append(line).append('\n');
        }
        reader.close();
        FileWriter fileWriter = new FileWriter(fileName);
        String result = stringBuilder.toString();
        fileWriter.write(result, 0, result.length() - 1);
        fileWriter.close();
    }

    private static void create(String fileName, String productName, String price, String quantity) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
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
        fileWriter.close();
    }

}
