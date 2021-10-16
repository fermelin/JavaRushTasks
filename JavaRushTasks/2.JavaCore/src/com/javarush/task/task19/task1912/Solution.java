package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
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
        System.out.println(byteArrayOutputStream.toString().replaceAll("te", "??"));



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
