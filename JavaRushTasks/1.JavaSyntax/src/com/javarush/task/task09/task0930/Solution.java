package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                numbers.add(i);
            } else {
                words.add(i);
            }
        }
        if (!words.isEmpty()) {
            for (int i = words.size() - 1; i != 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (isGreaterThan(array[words.get(j)], array[words.get(j + 1)])) {
                        String tmp = array[words.get(j)];
                        array[words.get(j)] = array[words.get(j + 1)];
                        array[words.get(j + 1)] = tmp;
                    }
                }
            }
        }
        if (!numbers.isEmpty()) {
            for (int i = numbers.size() - 1; i != 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (Integer.parseInt(array[numbers.get(j)]) < Integer.parseInt(array[numbers.get(j + 1)])) {
                        String tmp = array[numbers.get(j)];
                        array[numbers.get(j)] = array[numbers.get(j + 1)];
                        array[numbers.get(j + 1)] = tmp;
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
