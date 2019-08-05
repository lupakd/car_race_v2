package com.codecool.carrace;

import com.codecool.carrace.race.Race;
import com.codecool.carrace.race.vehicles.*;
import com.codecool.carrace.race.vehicles.Vehicle;

class Main {
    public static void main(String[] args) {
        Race race = new Race();


        for (int i = 0; i < 3; i++) {
            createGrid(race, new Car("Car" + i, "car"));
            createGrid(race, new Truck("Truck" + i, "truck"));
            createGrid(race, new MotorCycle("MotorCycle" + i, "motor", "No: "+i));
        }

        race.simulateRace();
        race.printRaceResults();
    }

    public static void createGrid(Race race, Vehicle vehicle) {
        for (int i = 0; i < 10; i++) {
            race.addVehicleToGrid(vehicle);
        }
    }

}
