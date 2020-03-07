package com.company.homework.personWithAccount;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("uslavii");
        Person.Account account = person.new Account("1234567890");
        account.displayAccount();
    }
}
