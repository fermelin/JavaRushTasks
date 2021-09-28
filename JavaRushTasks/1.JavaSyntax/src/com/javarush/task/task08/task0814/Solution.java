package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> setInt = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            setInt.add(i);
        }
        return setInt;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (Iterator<Integer> i = set.iterator(); i.hasNext(); ) {
            Integer num = i.next();
            if (num > 10) {
                i.remove();
            }
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
