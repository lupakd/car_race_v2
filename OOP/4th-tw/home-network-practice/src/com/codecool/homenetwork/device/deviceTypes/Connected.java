package com.codecool.homenetwork.device.deviceTypes;

import com.codecool.homenetwork.HomeNetwork;
import com.codecool.homenetwork.device.Device;

public class Connected extends Device {


    private final HomeNetwork hn;

    public Connected(int age, int batteryLife, HomeNetwork hn) {
        super(age, batteryLife);
        this.hn = hn;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of connected devices: " + getNumberOfConnectedDevices();
    }

    public int getNumberOfConnectedDevices() {
        int numOfConn = 0;
        for (Device dev : hn.getListOfDevices()) {
            if (dev instanceof Connected) {
                numOfConn++;
            }
        }
        return numOfConn - 1;
    }

    public int getRemainingPower() {
        return this.batteryLife = (batteryLife - (7 * this.age)) + getNumberOfConnectedDevices() * 20;
    }
}
