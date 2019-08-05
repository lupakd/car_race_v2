package com.codecool.workplace.employee;

public abstract class Employee {

    private static int idCounter = 0;
    protected String name;
    protected int id = idCounter++;
    protected String gruopName;
    protected long salary;


    public String getGruopName() {
        return gruopName;
    }

    public Employee(String name, String groupName) {
        this.name = name;
        this.gruopName = groupName;
    }

    public void setSalary() {}
}
