package com.company.classwork.lesson4.telephones;

public class SmartPhone extends CellPhone {

    private String os;

    public SmartPhone(String os, int year, int hours) {
        super(year, hours);
        this.os = os;
    }

    public void install(String app) {
        System.out.println("установить приложение " + app);
        unpack();
        removeFiles();
    }

    private void unpack() {

    }

    private void removeFiles() {

    }


}
