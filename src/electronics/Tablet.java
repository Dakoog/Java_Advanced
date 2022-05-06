package electronics;

public class Tablet extends Device implements EmailSender{

    public Tablet(String model) {
        super(model);
    }
    public void sendMessage(String type, String message){

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }


    public void sendEmail(String message) {
        System.out.println("Send new massage " + message);
    }
}
