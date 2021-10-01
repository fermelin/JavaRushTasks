package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String fileName = reader.readLine();
                InputStream inputStream = new FileInputStream(fileName);
                if (inputStream.available() < 1000) {
                    inputStream.close();
                    break;
                }
                inputStream.close();
            }
        } catch (Exception e) {}
        throw new DownloadException();
    }

    public static class DownloadException extends Exception {

    }
}
