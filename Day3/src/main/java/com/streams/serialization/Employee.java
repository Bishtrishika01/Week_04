
package com.streams.serialization;

import java.io.Serializable;

// Creating Employee class to use a object
class Employee implements Serializable {
    String name;
    int id;
    String department;
    double salary;

    Employee(String name,int id,String department,double salary){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.department= department;
    }

    // overriding tostring method to print detail of the employee
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
