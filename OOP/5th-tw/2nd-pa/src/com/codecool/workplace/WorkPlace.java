package com.codecool.workplace;

import com.codecool.workplace.employee.Employee;
import com.codecool.workplace.employee.WorkPlaceEmployeeCount;

import java.util.ArrayList;
import java.util.List;

public class WorkPlace implements WorkPlaceEmployeeCount {

    public List<Employee> getEmployees() {
        return employees;
    }

    private List<Employee> employees = new ArrayList<>();

    public long getNumberOfEmployeesInGroup(String groupName) {
        return employees.stream()
                .filter(employee -> employee.getGruopName().equals(groupName))
                .count();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "WorkPlace{" +
                "employees=" + employees +
                '}';
    }
}
