package com.codecool.company;

import com.codecool.company.skilledworkers.SkilledWorker;

import java.util.ArrayList;
import java.util.List;

public class SkilledCompany {

    public List<SkilledWorker> getListOfWorkers() {
        return listOfWorkers;
    }

    List<SkilledWorker> listOfWorkers = new ArrayList<>();

    public void addWorker(SkilledWorker worker) {
        listOfWorkers.add(worker);
    }


}
