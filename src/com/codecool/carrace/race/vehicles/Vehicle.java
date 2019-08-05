package com.codecool.carrace.race.vehicles;

import com.codecool.carrace.race.Race;

public abstract class Vehicle {
    private final String name;
    private final String type;
    protected int speed;
    protected int distance;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void printRaceResults() {
        System.out.println("name: " + name);
        System.out.println("type: " + type);
        System.out.println("Distance travelled: " + distance);
    }

    abstract void moveForAnHour();

    public void prepareForLap(Race race) {
        distance += speed;
    }
}
