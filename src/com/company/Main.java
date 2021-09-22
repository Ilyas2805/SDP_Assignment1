package com.company;

public class Main {

    public static void main(String[] args) {
	    Character character = new Queen();
        character.display();
        character.fight();

        character.setWeapon(new AxeBehavior());
        character.fight();

    }
}
