package company;

import java.math.BigDecimal;

public class Employee {
    private String name;
    protected int salary;// protected, because this field is use in class Manager (derived class)
    protected int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        System.out.printf("Data from Employee constructor. Name: %s, Salary: %s Age: %s%n", name, salary,age);
    }

    public final int getAge() { // final method -this method cannot be overrides in other classes
        System.out.print("I am ");
        return age;
    }

    public int getSalary() {
        System.out.print("I earn ");
        return salary;
    }

    public void show() {
        System.out.printf("\nShow information at new employee.%nMy name's %s.%n", name);
    }

}
