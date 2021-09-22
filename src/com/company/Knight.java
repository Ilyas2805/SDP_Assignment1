package com.company;

public class Knight extends Character{
    public Knight(){
        super(new BowAndArrowBehavior());
    }

    @Override
    void display() {
        System.out.println("I am a knight");
    }
}
