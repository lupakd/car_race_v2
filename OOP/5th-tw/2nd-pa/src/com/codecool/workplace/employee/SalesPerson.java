package com.codecool.workplace.employee;

public class SalesPerson extends Employee{

    private Rank rank;

    public SalesPerson(String name, String groupName) {
        super(name, groupName);
        this.rank = Rank.JUNIOR;
        setSalary();
    }

    @Override
    public void setSalary() {
        salary = rank.getRandomSalaryMultiplier();
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gruopName='" + gruopName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
