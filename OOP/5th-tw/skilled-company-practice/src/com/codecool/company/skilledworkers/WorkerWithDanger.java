package com.codecool.company.skilledworkers;

import com.codecool.company.skilledworkers.workernecessities.Experience;

public class WorkerWithDanger extends SkilledWorker {


    private boolean onHoliday;

    public WorkerWithDanger(String name, Experience exp, int dailyFee) {
        super(name, exp, dailyFee);
        this.setOnHoliday();
    }

    public void setOnHoliday() {
        this.onHoliday = false;
    }

    public boolean isOnHoliday() {
        return onHoliday;
    }
}
