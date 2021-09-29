package com.company;

public class PremiumClassChair extends Chair{

    public PremiumClassChair(){
        super(new Moveable());
    }

    @Override
    void display() {
        System.out.println("You selected premium chair");
    }
}
