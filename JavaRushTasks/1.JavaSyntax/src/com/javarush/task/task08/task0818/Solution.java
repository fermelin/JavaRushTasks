package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("lastname" + i, i);
        }
        return  map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> mapCopy = new HashMap<>(map);
        for (String key : mapCopy.keySet()) {
            if (mapCopy.get(key) < 500) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}