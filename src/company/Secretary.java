package company;

public final class Secretary extends Employee{
    public Secretary(String name, int salary) {
        super(name, salary);
        System.out.printf("Data from Secretary constructor. Name: %s, Salary: %s adn Bonus %s%n",name, salary);
    }
    public void makeCall(String number){
        System.out.println("I'm call to number "+ number);

    }

}
