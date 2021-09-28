package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy", Locale.US);
        try {
            Date date1 = formatter.parse(date);
            long lDate = date1.getTime();
            date1.setDate(1);
            date1.setMonth(0);
            long lDateBeginningOfYear = date1.getTime();
            long msInDay = 24 * 60 * 60 * 1000;
            long daysBetween = (lDate - lDateBeginningOfYear) / msInDay + 1;
            if (daysBetween % 2 == 0) {
                return false;
            }
        } catch (ParseException e) {
        }
        return true;
    }
}
