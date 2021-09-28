package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put("firstname" + i, "lastname" + i);
        }
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> mapCopy = new HashMap<>(map);
        ArrayList<String> namesToDelete = new ArrayList<>();
        for (String key : map.keySet()) {
            String value = map.get(key);
            mapCopy.remove(key);
            if (mapCopy.containsValue(value)) {
                namesToDelete.add(value);
            }
        }
        for (String s : namesToDelete) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
