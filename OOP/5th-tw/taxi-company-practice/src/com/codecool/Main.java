package com.codecool;

import com.codecool.taxicompany.TaxiCompany;
import com.codecool.taxicompany.car.carwithdriver.Electric;
import com.codecool.taxicompany.car.carwithdriver.Gasoline;
import com.codecool.taxicompany.car.SelfDriving;
import com.codecool.taxicompany.driver.Driver;

public class Main {


    public static void main(String[] args) {

        final int FULLYEAR = 52;
        TaxiCompany taxiCompany = new TaxiCompany();

        taxiCompany.addDriver(new Driver("John", 30, taxiCompany));
        taxiCompany.addDriver(new Driver("Bill", 30, taxiCompany));
        taxiCompany.addDriver(new Driver("Morgan", 21, taxiCompany));
        taxiCompany.addDriver(new Driver("Adam", 54, taxiCompany));
        taxiCompany.addDriver(new Driver("Cloe", 19, taxiCompany));
        taxiCompany.addDriver(new Driver("Thomas", 40, taxiCompany));
        taxiCompany.addDriver(new Driver("Veronica", 33, taxiCompany));

        taxiCompany.addCar(new Electric(taxiCompany));
        taxiCompany.addCar(new Gasoline(taxiCompany));
        taxiCompany.addCar(new SelfDriving());

        System.out.println(taxiCompany);
    }
}
