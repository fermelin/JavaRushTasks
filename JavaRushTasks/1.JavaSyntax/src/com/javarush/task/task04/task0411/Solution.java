package com.javarush.task.task04.task0411;

/* 
Время года
*/

import java.time.chrono.IsoEra;

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String[] seasons = {"none", "зима", "зима",
                            "весна", "весна", "весна",
                            "лето", "лето", "лето",
                            "осень", "осень", "осень",
                            "зима"};
        if (month > 0 && month < 13)
            System.out.println(seasons[month]);

    }
}