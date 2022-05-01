package animals;

public class Dog extends Animal implements Runner {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println("hau! hauuu!");

    }
    public void trackDownSomething(String item){
        System.out.println("Hau, hau! - I find "+ item);
    }

    @Override
    public void run() {
        System.out.println("I run: cloup, cloup");
    }
}
