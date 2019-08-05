package com.codecool.homenetwork.device;


public abstract class Device {

    protected int age;
    protected int batteryLife;


    public Device(int age, int batteryLife) {
        this.age = age;
        this.batteryLife = batteryLife;
    }

    public int getRemainingPower() {
        return this.batteryLife;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "\nRemaining power: " + getRemainingPower();
    }
}
