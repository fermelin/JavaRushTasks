package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();
            InputStream inputStream = new FileInputStream(fileName1);
            OutputStream outputStream1 = new FileOutputStream(fileName2);
            OutputStream outputStream2 = new FileOutputStream(fileName3);
            if (inputStream.available() > 0) {
                int amountOfBytes = inputStream.available();
                int oddAmount = 0;
                amountOfBytes = amountOfBytes / 2;
                if (inputStream.available() % 2 == 1) {
                    oddAmount = 1;
                    amountOfBytes += 1;
                }
                byte[] buffer = new byte[inputStream.available()];
                inputStream.read(buffer,0, inputStream.available());
                outputStream1.write(buffer, 0, amountOfBytes);
                outputStream2.write(buffer,amountOfBytes, amountOfBytes - oddAmount);
            }
                inputStream.close();
                outputStream1.close();
                outputStream2.close();

        } catch (Exception e) {}
    }
}
