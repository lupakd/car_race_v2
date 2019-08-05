package com.codecool;

import com.codecool.company.SkilledCompany;
import com.codecool.company.skilledworkers.Electrician;
import com.codecool.company.skilledworkers.GasFitter;
import com.codecool.company.skilledworkers.Plumber;
import com.codecool.company.skilledworkers.SkilledWorker;
import com.codecool.company.skilledworkers.workernecessities.Experience;

public class Main {

    public static void main(String[] args) {

        SkilledCompany company = new SkilledCompany();

        company.addWorker(new Plumber("asd", Experience.BEGINNER, 100));
        company.addWorker(new Electrician("asd", Experience.BEGINNER, 100));
        company.addWorker(new GasFitter("asd", Experience.BEGINNER, 100));
    for (SkilledWorker w : company.getListOfWorkers()) {
        System.out.println(w.toString());
    }
    }

}
