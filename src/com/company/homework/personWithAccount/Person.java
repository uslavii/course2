package com.company.homework.personWithAccount;

public class Person {

    public static String name;

    public Person(String name) {
        this.name = name;
    }

    class Account {
        public String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.println("name person of this account: " + Person.name);
            System.out.println("password: " + password);
        }

    }


}
