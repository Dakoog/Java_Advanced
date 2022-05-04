package animals;

public class Duck extends Bird {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void saySomething() {

    }
    class Duckling{
        public void say(){
            System.out.println("kwaii,kwaii");
        }
    }
}
