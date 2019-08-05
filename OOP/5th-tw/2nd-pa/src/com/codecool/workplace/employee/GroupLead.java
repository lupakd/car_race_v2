package com.codecool.workplace.employee;

public class GroupLead extends Employee {

    private WorkPlaceEmployeeCount employeeCount;

    public GroupLead(String name, String gruopName, WorkPlaceEmployeeCount count) {
        super(name, gruopName);
        this.employeeCount = count;
        setSalary();
    }
    @Override
    public void setSalary() {
        salary = 1800 + employeeCount.getNumberOfEmployeesInGroup(gruopName)*200;
    }


    @Override
    public String toString() {
        return "GroupLead{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gruopName='" + gruopName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
