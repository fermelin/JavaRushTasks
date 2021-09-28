package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирно1", dateFormat.parse("MAY 1 2012"));
        map.put("Смирн11", dateFormat.parse("AUGUST 1 2012"));
        map.put("Смир111", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сми1111", dateFormat.parse("APRIL 1 2012"));
        map.put("См11111", dateFormat.parse("JUNE 1 2012"));
        map.put("С111111", dateFormat.parse("JULY 1 2012"));
        map.put("Сидоров", dateFormat.parse("JULY 1 2012"));
        map.put("Сидоренко", dateFormat.parse("JULY 1 2012"));
        map.put("Сидор", dateFormat.parse("JULY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String,Date> iterMap = new HashMap<String,Date>(map);
        for (String s : iterMap.keySet()) {
            Date date = iterMap.get(s);
            int month = date.getMonth();
            if (month > 4 && month < 8) {
                map.remove(s);
            }
        }

    }

    public static void main(String[] args) {

    }
}
