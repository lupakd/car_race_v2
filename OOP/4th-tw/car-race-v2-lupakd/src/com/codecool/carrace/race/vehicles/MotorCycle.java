package com.codecool.carrace.race.vehicles;

import com.codecool.carrace.race.Race;

public class MotorCycle extends Vehicle {


    private final String number;

    public MotorCycle(String name, String type, String number) {
        super(name, type);

        this.number = number;
    }

    @Override
    public void printRaceResults() {
        super.printRaceResults();
        System.out.println(number);
    }

    @Override
    void moveForAnHour() {

    }

    @Override
    public void prepareForLap(Race race) {
        super.speed = 100;
        if (race.isRaining()) {
            speed *= 0.7;
        }
        super.prepareForLap(race);
    }
}