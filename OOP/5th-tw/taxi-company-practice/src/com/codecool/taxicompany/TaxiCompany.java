package com.codecool.taxicompany;

import com.codecool.taxicompany.car.Car;
import com.codecool.taxicompany.car.carwithdriver.Gasoline;
import com.codecool.taxicompany.driver.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiCompany implements MobileNoRegistry{


    public int getCompanyIncome() {
        return companyIncome;
    }

    private int companyIncome;
    private List<Car> listOfCars;
    private List<Driver> listOfDrivers;

    public TaxiCompany() {
        listOfCars = new ArrayList<>();
        listOfDrivers = new ArrayList<>();
    }

    public List<Car> getListOfCars() {
        return listOfCars;
    }

    public List<Driver> getListOfDrivers() {
        return listOfDrivers;
    }

    public void addCar(Car car) {
        listOfCars.add(car);
    }

    public void addDriver(Driver driver) {
        listOfDrivers.add(driver);
    }

    private void addWeeklyIncome() {
        companyIncome += listOfCars.stream()
                .mapToInt(Car::getPassengerAmountPerWeek)
                .sum();
    }

    public void generateWeeklyTraffic(TaxiCompany tC) {
        for (Car car : listOfCars) {
            if (car instanceof Gasoline) {
                ((Gasoline) car).calculateNextWeeksMaintenanceCost();
            }
            addWeeklyIncome();
        }

        System.out.println("Weekly buildup: " + getCompanyIncome());
        System.out.println();
    }

    @Override
    public String toString() {
        return
                "companyIncome: " + companyIncome +
                ", Cars: " + listOfCars +
                ", Drivers: " + listOfDrivers;
    }

    @Override
    public List<String> getPhoneNumbers() {
        return listOfDrivers.stream()
                .map(Driver::getMobileNo)
                .collect(Collectors.toList());
    }

    @Override
    public void registerDriver(String number) {

    }
}
