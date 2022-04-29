package company;

public final class Secretary extends Employee {// final class - this class cannot be extended by other classes

    public Secretary(String name, int salary, int age) {
        super(name, salary, age);
        System.out.printf("Data from Secretary constructor. Name: %s, Salary: %s Age: %s%n", name, salary, age);
    }

    public void makeCall(String number) {
        System.out.println("I'm call to number " + number);

    }

    @Override
    public void show() {
        super.show();
        System.out.println("I am secretary in this company.");
    }
}
