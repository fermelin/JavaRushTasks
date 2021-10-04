package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String countryName = this.customer.getCountryName();
            for (String key : countries.keySet()) {
                if (countries.get(key).equals(countryName)) {
                    return key;
                }
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().substring(
                    contact.getName().lastIndexOf(' ') + 1);
        }

        @Override
        public String getContactLastName() {
            return contact.getName().substring(0,
                    contact.getName().indexOf(','));
        }

        @Override
        public String getDialString() {
            char[] phoneNumber = contact.getPhoneNumber().toCharArray();
            String rawPhoneNumber = "+";

            for (int i = 0; i < phoneNumber.length; i++) {
                if (phoneNumber[i] >= '0' && phoneNumber[i] <= '9') {
                    rawPhoneNumber += phoneNumber[i];
                }
            }

            return "callto://" + rawPhoneNumber;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}