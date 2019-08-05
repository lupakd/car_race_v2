package com.codecool.taxicompany.car.carwithdriver;

import com.codecool.taxicompany.TaxiCompany;

public class Gasoline extends CarWithDriver {


    protected double maintenanceCost = 20;

    public Gasoline(TaxiCompany tC) {
        super(350, tC);
    }

    public double calculateNextWeeksMaintenanceCost() {
        this.maintenanceCost = maintenanceCost * 1.1;
        return maintenanceCost;
    }

    public String toString() {
        return super.toString() + "\nmaintenance cost: " + calculateNextWeeksMaintenanceCost();
    }
}
