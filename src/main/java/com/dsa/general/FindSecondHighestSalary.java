package com.dsa.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class FindSecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Sami", 4000),
                new Employee(201, "Rohan", 3000),
                new Employee(111, "Ameen", 5000),
                new Employee(211, "Rani", 9000),
                new Employee(301, "Ayan", 7000));

        Optional<Double> secondHighSal = employees.stream().map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHighSal);
    }
}
