package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String path = reader.readLine();
            InputStream inputStream = new FileInputStream(path);
            while (inputStream.available() > 0) {
                int data =  inputStream.read();
                System.out.write(data);

            }
            reader.close();
            inputStream.close();
        } catch (Exception e) {
            e.getCause();
        }



    }
}