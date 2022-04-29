package company;

import java.math.BigDecimal;

public class Employee {
    private String name;
    protected int salary;// protected, because this field is use in class Manager (derived class)

    public Employee(String name, int salary) {
        System.out.printf("Data from Employee constructor. Name: %s, Salary: %s%n", name, salary);
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void show() {
        System.out.printf("Show information at new employee.%nMy name's %s. I earn %s €.%n", name, salary);
    }

}
