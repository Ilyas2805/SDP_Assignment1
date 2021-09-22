package com.company;

public abstract class Character {
    private WeaponBehavior weapon;

    protected Character(WeaponBehavior weapon){
        this.weapon = weapon;
    }

    public void fight(){
        this.weapon.useWeapon();
    }

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    abstract void display();
}
