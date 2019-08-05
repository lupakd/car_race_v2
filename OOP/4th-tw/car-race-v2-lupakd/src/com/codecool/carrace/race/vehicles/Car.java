package com.codecool.carrace.race.vehicles;

import com.codecool.carrace.race.Race;

public class Car extends Vehicle {

    public Car(String name, String type) {
        super(name, type);
    }

    @Override
    public void moveForAnHour() {

    }

    @Override
   public  void prepareForLap(Race race) {
        if (race.hasBrokenTruck()) {
            speed = 75;
        }
        super.prepareForLap(race);
    }
}