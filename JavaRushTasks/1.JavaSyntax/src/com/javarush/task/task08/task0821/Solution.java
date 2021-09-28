package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Romanov", "Artem");
        map.put("Romanov", "Artemd");
        map.put("Romaov", "Artemk");
        map.put("Rmanov", "Artemk");
        map.put("Romano", "Artemkl");
        map.put("Romanv", "Artem");
        map.put("Rohanov", "Artem");
        map.put("Rojanov", "Artem");
        map.put("Rokanov", "Artem");
        map.put("Rolanov", "Artem");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
