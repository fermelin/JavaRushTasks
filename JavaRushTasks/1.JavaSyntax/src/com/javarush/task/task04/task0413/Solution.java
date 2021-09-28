package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int dayNum = Integer.parseInt(bufferedReader.readLine());
        String sDay;
        switch (dayNum) {
            case 1:
                sDay = "понедельник";
                break;
            case 2 :
                sDay = "вторник";
                break;
            case 3 :
                sDay = "среда";
                break;
            case 4 :
                sDay = "четверг";
                break;
            case 5 :
                sDay = "пятница";
                break;
            case 6 :
                sDay = "суббота";
                break;
            case 7 :
                sDay = "воскресенье";
                break;
            default:
                sDay = "такого дня недели не существует";
                break;
        }
        System.out.println(sDay);
    }
}