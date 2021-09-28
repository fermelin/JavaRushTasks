package com.javarush.task.task14.task1419;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Integer i = null;
            i.compareTo(10);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            InputStream stream = new FileInputStream("hello world");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[0];
            arr[0]++;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.get(10);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new SecurityException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new FileSystemException("");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new EOFException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException();

        } catch (Exception e) {
            exceptions.add(e);
        }



    }
}
