package com.codecool.taxicompany.car.carwithdriver;

import com.codecool.taxicompany.TaxiCompany;
import com.codecool.taxicompany.car.Car;
import com.codecool.taxicompany.driver.Driver;

import java.util.Random;

public abstract class CarWithDriver extends Car {


    protected Driver driver;

    public CarWithDriver(int cost, TaxiCompany tC) {
        super(cost);
        this.driver = tC.getListOfDrivers().get(new Random().nextInt(tC.getListOfDrivers().size()));
        this.passengerAmountPerWeek = driver.getNumberOfRidesPerWeek() * 4;
        driver.setSalary(this.cost);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                driver;
    }
}
