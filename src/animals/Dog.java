package animals;

public class Dog extends Animal implements Run {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {

    }

    @Override
    public void run() {
        System.out.println("I run: cloup, cloup");
    }
}
