package com.codecool.workplace.employee;

public class OfficeWorker extends Employee {

    public OfficeWorker(String name, String groupName) {
        super(name, groupName);
    }

    @Override
    public void setSalary() {
    }

    @Override
    public String toString() {
        return "OfficeWorker{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gruopName='" + gruopName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
