package animals;

public class AnimalMain {
    public static void main(String[] args) {
        Runner runner = new Dog("Nestor");
        // checking if the runner is a Dog instance to call
        // a method from the Animal class that Dog inherits
        if(runner instanceof Dog) {
            Dog runningDog = (Dog) runner;//
            runningDog.saySomething();
        }
        // calling object with internal class
        Duck duck = new Duck("Ugly duckling");
        Duck.Duckling duckling = duck.new Duckling();
        duckling.say();

        // anonymous class
        Animal animal = new Animal("Snail George"){
            @Override
            public void saySomething() {
                System.out.println("... snails");
            }
        };
    }
}
