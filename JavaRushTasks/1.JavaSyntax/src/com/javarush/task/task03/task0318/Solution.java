package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader.readLine().toString();
        String name = bufferedReader.readLine();
        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");


    }
}
