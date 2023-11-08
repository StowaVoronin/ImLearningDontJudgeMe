package homework.vehicle;

public class Car extends Vehicle {
    String licensePlate;

    public Car() {
        super();
        licensePlate = "";
    }

    public void wash() {
        System.out.println("This car has been washed. Number plate: " + licensePlate);
    }
}
