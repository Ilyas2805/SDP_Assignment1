package com.company;

public class Main {

    public static void main(String[] args) {
	    Chair chair = new DefaulChair();
        chair.display();
        chair.performMovement();
        System.out.println();
        chair.setMovementBehavior(new Moveable());
        chair.performMovement();

    }
}
