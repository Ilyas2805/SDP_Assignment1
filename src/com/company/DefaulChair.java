package com.company;

public class DefaulChair extends Chair {

    public DefaulChair(){
        super(new Standing());
    }

    @Override
    void display() {
        System.out.println("You selected a default chair");
    }
}
