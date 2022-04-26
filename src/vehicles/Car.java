package vehicles;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setModel(String model) {
        System.out.println(" -> This model was changed to "+ brand + " "+ model);
        System.out.println();
        this.model = model;
    }

    public void show() {
        System.out.printf("This is car %s, model: %s%n", brand, model);
    }

    @Override
    public String toString() {
        return"\n"+  brand + ' ' + model;
    }
}
