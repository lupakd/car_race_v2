package com.codecool.workplace.employee;

import java.util.Random;

public enum Rank {

    JUNIOR(new Random().nextInt(300)+ 1200),
    EXPERT(new Random().nextInt(300) + 1500);

    private int randomSalaryMultiplier;

    Rank(int randomSalaryGenerator) {
        this.randomSalaryMultiplier = randomSalaryGenerator;
    }


    public int getRandomSalaryMultiplier() {
        return randomSalaryMultiplier;
    }
}
