package com.company.classwork.lesson5.bodyguard;

public abstract class BodyGuard {

    Gun gun;

    private BodyGuard() {
    }

    public BodyGuard(Gun gun) {
        this.gun = gun;
    }

    abstract void applyMartialArts(Attacker attacker);

    void shoot(Attacker attacker) {
        gun.shoot(attacker);
    }

    public void saveClientLife(Attacker attacker) {
        if (attacker.hasGun()) {
            shoot(attacker);
        } else {
            applyMartialArts(attacker);
        }
    }
}
