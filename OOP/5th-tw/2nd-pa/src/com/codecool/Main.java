package com.codecool;

import com.codecool.workplace.WorkPlace;
import com.codecool.workplace.employee.GroupLead;
import com.codecool.workplace.employee.OfficeWorker;
import com.codecool.workplace.employee.SalesPerson;

public class Main {
    public static void main(String[] args) {
        WorkPlace workPlace = new WorkPlace();

        workPlace.addEmployee(new SalesPerson("safv", "Group1"));
        workPlace.addEmployee(new OfficeWorker("sdlifhh", "Group1"));
        workPlace.addEmployee(new GroupLead("dfkjvh", "Group1", workPlace));

        System.out.println(workPlace);
    }
}
