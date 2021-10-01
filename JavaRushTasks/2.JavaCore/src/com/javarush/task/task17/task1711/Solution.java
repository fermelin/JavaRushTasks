package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static void createPerson(String name, String sex, String birthDay) {
        SimpleDateFormat parseFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Person newPerson = sex.equals("м") ?
                    Person.createMale(name, parseFormat.parse(birthDay)) :
                    Person.createFemale(name, parseFormat.parse(birthDay));
            allPeople.add(newPerson);
            System.out.println(allPeople.size() - 1);
        } catch (ParseException e) {}
    }
    private static void readPerson(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        SimpleDateFormat readDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String sex = person.getSex() == Sex.MALE ? "м" : "ж";
        System.out.println(person.getName() + " " + sex + " " + readDateFormat.format(person.getBirthDate()));
    }
    private static void deletePerson(String id) {
        Person person = allPeople.get(Integer.parseInt(id));
        person.setBirthDate(null);
        person.setName(null);
        person.setSex(null);
    }
    private static void updatePerson(String id, String name, String sex, String birthDay) {
        SimpleDateFormat parseFormat = new SimpleDateFormat("dd/MM/yyyy");
        Person person = allPeople.get(Integer.parseInt(id));
        person.setName(name);
        Sex sex1 = sex.equals("м") ? Sex.MALE : Sex.FEMALE;
        person.setSex(sex1);
        try {
            person.setBirthDate(parseFormat.parse(birthDay));
        } catch (ParseException e) {}

    }
    public static void main(String[] args) {
        switch (args[0]) {
            case ("-c") :
                synchronized (allPeople) {
                    for (int i = 3; i < args.length; i += 3) {
                        createPerson(args[i - 2], args[i - 1], args[i]);
                    }
                }
                break;
            case ("-i") :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        readPerson(args[i]);
                    }
                }
                break;
            case ("-u") :
                synchronized (allPeople) {
                    for (int i = 4; i < args.length; i += 4) {
                        updatePerson(args[i - 3], args[i - 2], args[i - 1], args[i]);
                    }
                }
                break;
            case ("-d") :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        deletePerson(args[i]);
                    }
                }
                break;
            }
        }

}
