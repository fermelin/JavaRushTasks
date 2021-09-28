package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] chars = string.toCharArray();
        boolean newWord = true;
        for (int i = 0; i < chars.length; i++) {
            if (newWord && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                newWord = false;
            } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
                newWord = true;
            }
        }
        String capitalizedStr = new String(chars);
        System.out.println(capitalizedStr);
    }
}
