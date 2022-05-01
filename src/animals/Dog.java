package animals;

public class Dog extends Animal implements Runner {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println("hau! hauuu!");

    }

    @Override
    public void run() {
        System.out.println("I run: cloup, cloup");
    }
}
