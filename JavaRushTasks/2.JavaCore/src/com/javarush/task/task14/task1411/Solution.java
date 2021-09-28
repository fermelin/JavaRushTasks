package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true)
        {
            key = reader.readLine();

            switch (key) {
                case ("user") :
                    person = new Person.User();
                    break;
                case ("loser") :
                    person = new Person.Loser();
                    break;
                case ("coder") :
                    person = new Person.Coder();
                    break;
                case ("proger") :
                    person = new Person.Proger();
                    break;
                default :
                    return;
            }
            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
