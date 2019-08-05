package com.codecool.taxicompany.car;

public abstract class Car {

    private int id;
    private static int idCounter;
    protected int cost;
    protected int passengerAmountPerWeek;

    public Car(int cost) {
        idCounter++;
        this.id = idCounter;
        this.cost = cost;
    }

    public int getPassengerAmountPerWeek() {
        return passengerAmountPerWeek;
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        return getClass().getSimpleName() + "\nPassengers per week: " + getPassengerAmountPerWeek();
    }
}
