package com.company.classwork.lesson4.telephones;

public class Main {

    public static void main(String[] args) {

        AbstractPhone thomasEdisonPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone smartPhone = new SmartPhone("ios",2000,12);

        User user = new User("Vasia");

        user.callAnotherUser(102,thomasEdisonPhone);
        user.callAnotherUser(103, phone);
        user.callAnotherUser(101, smartPhone);



    }

}
