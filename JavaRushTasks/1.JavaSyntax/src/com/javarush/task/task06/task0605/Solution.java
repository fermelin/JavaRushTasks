package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double massIndex = weight / (height * height);
            String message = "";
            if (massIndex < 18.5) {
                message = "Недовес: меньше чем 18.5";
            } else if (massIndex > 18.49999 && massIndex < 25.0) {
                message = "Нормальный: между 18.5 и 25";
            } else if (massIndex > 24.99999 && massIndex < 30.0) {
                message = "Избыточный вес: между 25 и 30";
            } else if (massIndex > 29.9999) {
                message = "Ожирение: 30 или больше";
            }
            System.out.println(message);
        }
    }
}
