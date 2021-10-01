package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileSource;
        String fileToRemove;
        try {
            fileSource = reader.readLine();
            fileToRemove = reader.readLine();
            Thread t1 = new FileReader(fileSource, allLines);
            Thread t2 = new FileReader(fileToRemove, forRemoveLines);
            t1.join();
            t2.join();
            Solution sol = new Solution();
            sol.joinData();
        } catch (Exception e) {}

    }

    public static class FileReader extends Thread {
        public FileReader(String fileName, List<String> list) {
            try {
                InputStream inputStream = new FileInputStream(fileName);
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    list.add(line);
                }
                reader.close();
                inputStream.close();
            } catch (Exception e) {}
        }
        @Override
        public void run() {

        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
