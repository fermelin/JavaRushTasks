package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       try {
           String line;
           while(true) {
               line = reader.readLine();
               if (line.equals("exit")) {
                   break;
               }
               new ReadThread(line);
           }
           reader.close();
       } catch (Exception e) {
           e.getCause();
       }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            start();
        }

        public String getFileName() {
            return fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            String fileName = this.fileName;
            try {
                FileReader fileReader = new FileReader(fileName);
                Map<Character, Integer> map = new HashMap<>();
                char[] buffer = new char[1024];
                int lengthRead;
                while ((lengthRead = fileReader.read(buffer)) > 0) {
                    for (int i = 0; i < lengthRead; i++) {
                        int count = map.getOrDefault(buffer[i], 0) + 1;
                        map.put(buffer[i], count);
                    }
                }
                fileReader.close();
                ArrayList<Integer> list = new ArrayList<>(map.values());
                list.sort(Comparator.reverseOrder());
                int max = list.get(0);
                for (Character c : map.keySet()) {
                    if (map.get(c) == max) {
                        resultMap.put(fileName, (int) c);
                        break;
                    }
                }
            } catch (Exception e) {
            }
        }
    }
}
