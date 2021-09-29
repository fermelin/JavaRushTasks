package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new testThread1());
        threads.add(new testThread2());
        threads.add(new testThread3());
        threads.add(new testThread4());
        threads.add(new testThread5());
    }
    public static void main(String[] args) {
    }
    public static class testThread1 extends Thread {
        public void run() {
           while (true) {}
        }
    }
    public static class testThread2 extends Thread {
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }
    public static class testThread3 extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        }
    }
    public static class testThread4 extends Thread implements Message{
        private volatile boolean isInterrupted = false;
        public void run() {
            while (!isInterrupted) {
            }
        }
        public void showWarning() {
           isInterrupted = true;
        }
    }
    public static class testThread5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            String line;
            while (true) {
                try {
                    line = reader.readLine();
                    if (line.equals("N")) {
                        System.out.println(sum);
                        break;
                    }
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (Exception e) {}
            }
        }
    }
}