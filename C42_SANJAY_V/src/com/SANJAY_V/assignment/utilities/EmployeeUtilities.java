package com.SANJAY_V.assignment.utilities;

import com.SANJAY_V.assignment.employees.Employee;
import com.SANJAY_V.assignment.employees.Manager;
import com.SANJAY_V.assignment.employees.Developer;


public class EmployeeUtilities {


    public double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }


    public void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}

