package com.algorithmsPractice.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    Employee(int id, String name,  int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id, employee.id);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class New {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(30, "amaan",10));
        employees.add(new Employee(10, "zaid",10));
        employees.add(new Employee(20, "huzaif",40000));

        Comparator<Employee> bySalaryThenId = (e1, e2) ->{
            int result = Integer.compare(e1.salary, e2.salary);
            if(result == 0){
                return e1.name.compareTo(e2.name);
            }
            return result;
        };
        Collections.sort(employees, bySalaryThenId);
        System.out.println(employees);
    }
}