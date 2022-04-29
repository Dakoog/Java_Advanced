package company;

import java.math.BigDecimal;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary) {
        super(name, salary);
        System.out.printf("Data from Employee constructor. Name: %s, Salary: %s", name, salary);
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        System.out.printf("Data from Manager constructor. Name: %s, Salary: %s adn Bonus %s%n", name, salary, bonus);

    }

    public void show() { // on overridden method -> overrides a method in a base class and added method with base class (super.show());
        super.show();
        System.out.println("I am manager");
    }

    public void makeSpeech() {
        System.out.println("Go work, everybody");
    }

    @Override  // an overridden method -> overrides a method in a base class
    public int getSalary() {
        return salary + bonus;

    }

    public void makeSpeech(String additionalMessage) { // method overload with an additional argument
        System.out.println(additionalMessage);
    }


}
