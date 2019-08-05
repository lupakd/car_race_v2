package com.codecool.company.skilledworkers;

import com.codecool.company.skilledworkers.workernecessities.Experience;

public abstract class SkilledWorker {

    private String name;
    private double dailyFee;
    private Experience exp;
    private boolean working;
    private boolean answeringCalls;

    public SkilledWorker(String name, Experience exp, int dailyFee) {
        this.name = name;
        this.exp = exp;
        this.dailyFee = dailyFee*exp.getFeeKept();

    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void setAnsweringCalls(boolean answeringCalls) {
        this.answeringCalls = answeringCalls;
    }

    @Override
    public String toString() {
        return "SkilledWorker{" +
                "name='" + name + '\'' +
                ", dailyFee=" + dailyFee +
                ", exp=" + exp +
                ", working=" + working +
                ", answeringCalls=" + answeringCalls +
                '}';
    }
}
