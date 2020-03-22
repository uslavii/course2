package com.company.classwork.lesson5.bodyguard;

public class ConcreteBodyGuard extends BodyGuard {

    public ConcreteBodyGuard(Gun gun) {
        super(gun);
    }
    @Override
    void applyMartialArts(Attacker attacker) {
        karate();
    }

    private void karate() {
        System.out.println("karate");
    }
}
