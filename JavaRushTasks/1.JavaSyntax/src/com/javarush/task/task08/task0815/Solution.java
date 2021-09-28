package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("firstname" + i, "lastname" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String s : map.values()) {
            if (name.equals(s)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String s : map.keySet()) {
            if (lastName.equals(s)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
