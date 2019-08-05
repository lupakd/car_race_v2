package com.codecool.carrace.race;

// TODO Race helyett lehetne ezt beadni a prepareForLap()-nek, es akkor csokkentve van a fuggoseg a ket class kozott
public interface PrepareParameters {

    boolean hasBrokenTruck();
    boolean isRaining();
    // ...
}
