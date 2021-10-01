package com.javarush.task.task17.task1710;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
//    private static Sex ;

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
            if (args[0].equals("-c")) {
                createPerson(args[1], args[2], args[3]);
            } else if (args[0].equals("-r")) {
                readPerson(args[1]);
            } else if (args[0].equals("-u")) {
                updatePerson(args[1], args[2], args[3], args[4]);
            } else if (args[0].equals("-d")) {
                deletePerson(args[1]);
            }
    }
}
