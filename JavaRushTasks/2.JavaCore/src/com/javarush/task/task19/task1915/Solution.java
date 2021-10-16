package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            fileName = reader.readLine();
            reader.close();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(byteArrayOutputStream);

            PrintStream systemOut = System.out;
            System.setOut(printStream);
            testString.printSomething();
            System.setOut(systemOut);
            printStream.close();
            System.out.println(byteArrayOutputStream.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.close();
        } catch (Exception e) {
            e.getCause();
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

