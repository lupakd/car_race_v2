package com.codecool.homenetwork.device.deviceTypes;

public enum ScreenSize {

    EDTV(5),
    HD(10),
    FULLHD(15),
    UHD(20);

    private int batteryDrain;

    public int getBatteryDrain() {
        return batteryDrain;
    }

    ScreenSize(int batteryDrain) {
        this.batteryDrain = batteryDrain;
    }
}
