package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            InputStream inputStream = new FileInputStream(fileName1);
            OutputStream outputStream = new FileOutputStream(fileName2);
            if (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                byte[] reverseBuffer = new byte[inputStream.available()];
                inputStream.read(buffer, 0, inputStream.available());
                for (int i = 0; i < buffer.length; i++) {
                    reverseBuffer[i] = buffer[buffer.length - i - 1];
                }
                outputStream.write(reverseBuffer, 0, buffer.length);
            }
            inputStream.close();
            outputStream.close();
        } catch (Exception e) {}
    }
}
