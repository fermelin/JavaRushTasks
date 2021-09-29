package com.javarush.task.task15.task1527;

import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        ArrayList<String> arrayList = new ArrayList<>();

        int start = url.indexOf('?') + 1;
        if (start == 0) {
            return;
        }
        while (true) {
            int equalsSign = url.indexOf('=', start);
            int ampersandSign = url.indexOf('&', start);
            int end = ((equalsSign < ampersandSign && equalsSign != -1) ||
                    (equalsSign != -1 && ampersandSign == -1))
                    ? equalsSign : ampersandSign;
            end = (end == -1) ? url.length() : end;
            arrayList.add(url.substring(start,end));
            if (ampersandSign != -1) {
                start = ampersandSign + 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if (i + 1 != arrayList.size()) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        int objIndex = url.indexOf("obj=");
        if (objIndex != -1) {
            objIndex += "obj=".length();
            int end = url.indexOf('&', objIndex);
            if (end == -1) {
                end = url.length();
            }
            String sObj = url.substring(objIndex, end);
            try {
                alert(Double.parseDouble(sObj));
            } catch (NumberFormatException e) {
                alert(sObj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
