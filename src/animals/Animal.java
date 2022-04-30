package animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void saySomething(); // abstract class can't implement method;

}