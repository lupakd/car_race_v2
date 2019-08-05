package com.codecool.carrace.race;

import com.codecool.carrace.race.Conditions.Weather;
import com.codecool.carrace.race.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Race implements PrepareParameters {

    private List<Vehicle> vehicles = new ArrayList<>();
    private Weather weather = new Weather();

    private boolean hasBrokenDownTruck = false;
    private static final int LAPS = 50;

    public void simulateRace() {
        for (int i = 0; i < LAPS; i++) {
            simulateLap();
        }
    }

    private void simulateLap() {
        weather.randomizeRaining();

        for (Vehicle v : vehicles) {
            v.prepareForLap(this);
        }
    }

    public void addVehicleToGrid(Vehicle vehicle) {
        vehicles.add(vehicle);

    }

    public void printRaceResults() {
        for (Vehicle v : vehicles) {
            v.printRaceResults();
        }
    }

    public static void main(String[] args) {
    }

    public void setHasBrokenDownTruck() {
        hasBrokenDownTruck = true;
    }

    @Override
    public boolean hasBrokenTruck() {
        return hasBrokenDownTruck;
    }

    @Override
    public boolean isRaining() {
        return weather.isRaining();
    }
}
