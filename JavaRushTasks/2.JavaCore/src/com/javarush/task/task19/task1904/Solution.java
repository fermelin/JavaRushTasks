package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] tokens = line.split(" ");
            String sDate = String.format("%s %s %s", tokens[3], tokens[4], tokens[5]);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            try {
                Date date = simpleDateFormat.parse(sDate);
                Person person = new Person(tokens[1], tokens[2], tokens[0], date);
                return person;
            } catch (Exception e) {}
            return null;

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
