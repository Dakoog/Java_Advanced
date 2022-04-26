package vehicles;

public class VehiclesMain {
    public static void main(String[] args) {

        Car[] cars = new Car[5];

        cars[0] = new Car("Ferrari", "Testarossa");
        cars[1] = new Car("Fiat", "Maluch");
        cars[2] = new Car("Lamborghini", "Huracane");
        cars[3] = new Car("Opel", "Astra");
        cars[4] = new Car("", "Huracane");
        System.out.print(cars[2]+"\b");
        cars[2].setModel("Veneno");
        System.out.println("We've got to rent those cars: ");
        for (Car car : cars) {
            car.show();
        }

    }
}
