package com.mycompany.hmgava2;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(String id, String name, double baseSalary, LocalDate joinDate, double allowance) {
        super(id, name, baseSalary, joinDate);
        this.allowance = allowance;
    }

    public double calculateNetSalary() {
        return baseSalary + allowance;
    }

    public double calculateBonus(double score) {
        return (baseSalary * 0.10) * score;
    }
}
