package src.main.java.homework.vehicle;

public class Car extends Vehicle{
    private int passengers;
    private String licensePlate;

    public Car(int passengers, String licensePlate) {
        this.passengers = passengers;
        this.licensePlate = licensePlate;
    }

    public String getPassengersInfo() {
        return "License Plate: " + licensePlate + ", Passengers: " +  passengers;
    }
}




