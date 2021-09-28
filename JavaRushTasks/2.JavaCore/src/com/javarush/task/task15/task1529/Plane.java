package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int amountOfPassangers;

    public void fly() {
        System.out.println("Shhh...");
    }
    public Plane(int passangers) {
        this.amountOfPassangers = passangers;
    }
}
