package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Integer number = null;
        try {
            while (true) {
                str = reader.readLine();
                try {
                    number = Integer.parseInt(str);
                } catch (NumberFormatException e) {}

                if (str.contains(".")) {
                    try {
                        print(Double.parseDouble(str));
                    } catch (NumberFormatException e) {}
                } else if ( number != null && number > 0 && number < 128) {
                    print(number.shortValue());
                } else if (number != null && (number <= 0 || number >= 128)) {
                    print(number);
                } else {
                    print(str);
                }

                if (str.equals("exit")) {
                    break;
                }
                number = null;
            }
        } catch (Exception e) {
            e.getCause();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
