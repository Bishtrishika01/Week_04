/*Group Objects by Property
Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].*/
package com.collections.mapinterface;

import java.util.*;

class Employee {
    private String name;
    private String department;

    // Constructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return name;
    }
}
class EmployeeGrouper {

    // Method to group employees by department
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedMap = new HashMap<>();

        // Iterating through each employee
        for (Employee employee : employees) {
            groupedMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        return groupedMap;
    }
}
public class EmployeeGrouperMain {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Grouping employees by department
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);

        // Printing the grouped employees
        groupedEmployees.forEach((department, empList) ->
                System.out.println(department + ": " + empList));
    }
}
