package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    private static final int key = 13;
    public static void main(String[] args) {
         boolean encrypt = args[0].equals("-e");
         try {
             encrypter(args[1], args[2], encrypt);
         } catch (Exception e) {}
    }
    private static void encrypter(String fileName, String fileOutputName, boolean encrypt) throws IOException {
        int key = encrypt ? Solution.key : - 1 * Solution.key;

        InputStream inputStream = new FileInputStream(fileName);
        OutputStream outputStream = new FileOutputStream(fileOutputName);
        byte[] buffer = new byte[inputStream.available()];
        byte[] bufferResult = new byte[inputStream.available()];
        inputStream.read(buffer);
        for (int i = 0; i < buffer.length; i++) {
            bufferResult[i] = (byte) (buffer[i] + key);
        }
        outputStream.write(bufferResult);
        inputStream.close();
        outputStream.close();
    }

}
