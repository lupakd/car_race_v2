package com.codecool.company.skilledworkers.workernecessities;

public enum Experience {
    BEGINNER(0.6),
    MEDIUM(0.7),
    EXPERT(0.8);

    public double getFeeKept() {
        return feeKept;
    }

    private double feeKept;

    Experience(double percentOfFeeKept) {
        this.feeKept = percentOfFeeKept;

    }
}
