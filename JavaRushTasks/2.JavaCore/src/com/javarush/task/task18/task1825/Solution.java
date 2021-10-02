package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {


    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            ArrayList<String> arrayList = new ArrayList<>();
            while (true) {
                line = reader.readLine();
                if (line.equals("end")) {
                    reader.close();
                    break;
                }
                arrayList.add(line);
            }
            arrayList.sort(Solution::compare);
            FileWriter fileWriter = new FileWriter(arrayList.get(0).substring(0, arrayList.get(0).indexOf(".part")));
            char[] buffer = new char[1024];
            for (int i = 0; i < arrayList.size(); i++) {
                FileReader fileReader = new FileReader(arrayList.get(i));
                int lengthRead;
                while ((lengthRead = fileReader.read(buffer)) > 0) {
                    fileWriter.write(buffer, 0, lengthRead);
                }
                fileReader.close();
            }
            fileWriter.close();

        } catch (Exception e) {
            e.getCause();
        }
    }

        public static int compare(String o1, String o2) {
            return Integer.parseInt(o1.substring(o1.indexOf(".part") + 5)) -
                    Integer.parseInt(o2.substring(o2.indexOf(".part") + 5));
        }
}
