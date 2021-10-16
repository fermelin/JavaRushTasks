package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        PrintStream systemOut = System.out;
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(systemOut);
        printStream.close();

        String[] strings = byteArrayOutputStream.toString().split(" ");
        try {
            int num1 = Integer.parseInt(strings[0]);
            String operation = strings[1];
            int num2 = Integer.parseInt(strings[2]);
            int result = 0;
            if (operation.equals("+")) {
                result = num1 + num2;
            } else if (operation.equals("-")) {
                result = num1 - num2;
            } else if (operation.equals("*")) {
                result = num1 * num2;
            }
            System.out.println(byteArrayOutputStream.toString() + result);
        } catch (Exception e) {
            e.getCause();
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

