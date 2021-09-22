package com.company;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I am using bow and arrow to fight");
    }
}
