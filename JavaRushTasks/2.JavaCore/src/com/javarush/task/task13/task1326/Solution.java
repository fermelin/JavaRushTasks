package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            String fileName = reader.readLine();
            reader.close();
            InputStream inputStream = new FileInputStream(fileName);
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader1.readLine()) != null) {
                int number = Integer.parseInt(line);
                arrayList.add(number);
            }
            reader1.close();
            inputStream.close();

        } catch (Exception e) {
            e.getCause();
        }
        arrayList.removeIf(e -> e % 2 != 0);
        Collections.sort(arrayList);
        for (int i : arrayList) {
            System.out.println(i);
        }
    }
}
