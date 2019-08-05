package com.codecool.carrace.race.vehicles;

import com.codecool.carrace.race.Race;

public class Truck extends Vehicle {

    private boolean broken;

    public Truck(String name, String type) {
        super(name, type);
    }

    @Override
    public void prepareForLap(Race race) {
        super.speed = 100;
        if (true) {   // 5%
            broken = true;
            race.setHasBrokenDownTruck();
        }
        /*if (this.broken) {
            // speed basztatas logic
            speed = 0;
        }*/
        super.prepareForLap(race);
    }

    @Override
    void moveForAnHour() {

    }
}