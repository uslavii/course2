package com.company.homework.personWithAccount;

public class PersonTest {
    public static void main(String[] args) {
        Person.Account account = new Person.Account("1234567890");
        Person person = new Person(account, "uslavii");
        account.displayAccount();
    }
}
