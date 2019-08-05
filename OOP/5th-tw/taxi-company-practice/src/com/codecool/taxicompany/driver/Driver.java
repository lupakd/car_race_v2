package com.codecool.taxicompany.driver;

import com.codecool.taxicompany.MobileNoRegistry;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

public class Driver {

    private String name;
    private int age;
    private MobileNoRegistry registry;
    private int salary;
    private int mobileNo;
    private Experience exp;
    private int numberOfRidesPerWeek;

    public Driver(String name, int age, MobileNoRegistry registry) {
        this.name = name;
        this.age = age;
        this.registry = registry;
        this.mobileNo = new Random().nextInt(99998) + 1;
        this.exp = Experience.randomValue();
        this.numberOfRidesPerWeek = exp.getNumOfRidesPerWeek();
        registry.registerDriver(getMobileNo());
    }

    public int getNumberOfRidesPerWeek() {
        return numberOfRidesPerWeek;
    }

    public String getMobileNo() {
        return new DecimalFormat("00000").format(mobileNo);
    }

    public List<String> getMobileNumberOfDrivers() {
        return registry.getPhoneNumbers();
    }

    public void setSalary(int costOfCar) {
        this.salary = costOfCar;
    }


    public String toString() {
        return "Driver details: " +
                "\n name: " + name +
                "\n age: " + age +
                "\n salary: " + salary +
                "\n mobile: " + mobileNo +
                "\n experience " + exp +
                "\n rides per week: " + numberOfRidesPerWeek +
                "\n list of mobiles: " + getMobileNumberOfDrivers() +
                "\n";
    }
}
