package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    private static void fileCopier(FileReader from, FileWriter to) throws IOException {
        char[] buffer = new char[1024];
        int lengthRead;
        while ((lengthRead = from.read(buffer)) > 0) {
            to.write(buffer, 0, lengthRead);
        }
    }
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();
            FileWriter fileWriter = new FileWriter(fileName1);
            FileReader fileReader = new FileReader(fileName2);
            FileReader fileReader1 = new FileReader(fileName3);
            fileCopier(fileReader, fileWriter);
            fileCopier(fileReader1, fileWriter);
            fileWriter.close();
            fileReader.close();
            fileReader1.close();
        } catch (Exception e) {
            e.getCause();
        }
    }
}
