package com.mycompany.hmgava2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HMgava2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new FullTimeEmployee("E001", "ahmed", 5000.0, LocalDate.of(2020, 5, 12), 1000.0));
        employees.add(new ContractorEmployee("E002", "sara", LocalDate.of(2022, 1, 15), 50, 120));
        employees.add(new FullTimeEmployee("E003", "mohmed", 7000.0, LocalDate.of(2018, 11, 1), 1500.0));
        employees.add(new ContractorEmployee("E004", "anwar", LocalDate.of(2023, 3, 10), 60, 100));

        System.out.println("=== 1. original employees list===");
        for (Employee e : employees) {
            System.out.println(e);
        }
         Collections.sort(employees);
        System.out.println("\n=== 2. sorted list by net salary descending (Comparable) ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.sort(Comparator.comparing(Employee::getJoinDate));
        System.out.println("\n=== 3.sorted last by join data / seniority(Comparator) ===");
        for (Employee e : employees) {
            System.out.println(e);
        }

        double totalTax = 0;
        double totalBonus = 0;
        double performanceScore = 4.5;

        for (Employee e : employees) {
            totalTax += e.calculateTax();
            totalBonus += e.calculateBonus(performanceScore);
        }

        System.out.println("\n=== 4. Financial Reports & Totals ===");
        System.out.println("Total Collected Taxes: " + totalTax);
        System.out.println("Total Distributed Bonuses: " + totalBonus);
    }
}
