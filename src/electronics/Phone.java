package electronics;

public class Phone extends Device {
    private String number;

    public void makeCall(String number) {
        System.out.println("I'm calling to " + number);
    }

    public Phone(String model) {
        super(model);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
