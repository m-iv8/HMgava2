package com.mycompany.hmgava2;

import java.time.LocalDate;

public class ContractorEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    public ContractorEmployee(String id, String name, LocalDate joinDate, int hourlyRate, int hoursWorked) {
        super(id, name, 0.0, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateNetSalary() {
        return hourlyRate * hoursWorked;
    }

    public double calculateBonus(double score) {
        if (score > 4.0) {
            return 500.0;
        }
        return 0.0;
    }
}