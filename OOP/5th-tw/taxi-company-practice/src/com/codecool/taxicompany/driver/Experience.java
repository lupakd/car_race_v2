package com.codecool.taxicompany.driver;

import java.util.Random;

public enum Experience {

    BEGINNER(15),
    ADVANCED(40),
    PROFESSIONAL(40);

    private int numOfRidesPerWeek;

    public static Experience randomValue() {
        return values()[new Random().nextInt(Experience.values().length)];
    }

    public int getNumOfRidesPerWeek() {
        return numOfRidesPerWeek;
    }

    Experience(int numOfRidesPerWeek) {
        this.numOfRidesPerWeek = numOfRidesPerWeek;
    }






}
