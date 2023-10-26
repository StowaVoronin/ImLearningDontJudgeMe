package src.main.java.homework.vehicle;

public class Truck extends Car{
    private int loadCapacity;

    public Truck(int passengers, String licensePlate, int loadCapacity) {
        super(passengers, licensePlate);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

}
