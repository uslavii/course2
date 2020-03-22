package com.company.classwork.lesson5.bodyguard;

public class Attacker {

    Gun gun;

    public Attacker() {
    }

    public Attacker(Gun gun) {
        this.gun = gun;
    }


    public boolean hasGun() {
        return false;
    }
}
