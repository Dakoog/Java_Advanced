package company;

import java.math.BigDecimal;

public class Manager extends Employee {
    private int bonus;
    private Secretary secretary; // object Secretary for composition

    public void setSecretary(Secretary secretary){ // added new secretary
        this.secretary = secretary;
    }

    public void makeCall(String number){
        if (this.secretary == null){
            System.out.println("I cannot make call. I need secretary.");
        } else {
            this.secretary.makeCall(number);
        }
    }

    public Manager(String name, int salary, int age) {
        super(name, salary, age);
        System.out.printf("Data from Employee constructor. Name: %s, Salary: %s", name, salary);
    }

    public Manager(String name, int salary, int age, int bonus) {
        super(name, salary, age);
        this.bonus = bonus;
        System.out.printf("Data from Manager constructor. Name: %s, Salary: %s  Bonus: %s Age: %s%n", name, salary, bonus, age);

    }

    @Override
    public void show() { // on overridden method -> overrides a method in a base class and added method with base class (super.show());
        super.show();
        System.out.println("I am manager");
    }

    public void makeSpeech() {
        System.out.println("Go work, everybody");
    }

    @Override  // an overridden method -> overrides a method in a base class
    public int getSalary() {
        super.getSalary();
        return salary + bonus;
    }

    public void makeSpeech(String additionalMessage) { // method overload with an additional argument
        System.out.println(additionalMessage);
    }


}
