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
    }
}
