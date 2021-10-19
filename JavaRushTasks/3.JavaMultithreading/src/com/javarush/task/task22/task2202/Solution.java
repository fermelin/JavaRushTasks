package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        int firstSpace = string.indexOf(' ');
        int fourthSpace = firstSpace;
        for (int i = 0; i < 3; i++) {
            fourthSpace++;
            fourthSpace = string.indexOf(' ', fourthSpace);
            if (fourthSpace == -1) {
                throw new TooShortStringException();
            }
        }
        int lastSymbol = string.indexOf(' ', fourthSpace + 1);
        if (lastSymbol == -1) {
            lastSymbol = string.length();
        }
        return string.substring(firstSpace + 1, lastSymbol);
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
