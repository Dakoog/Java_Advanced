package electronics;

public class Radio extends Device {

    public Radio(String model) {
        super(model);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    private void changeChannel(String channel) {
        System.out.println("Change to channel "+ channel);
    }
}
