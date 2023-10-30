package src.main.java.homework.vehicle;

public class Vehicle {
    String driver;
    public String getDriverInfo() {
        return driver;
    }
    public Vehicle(String driver) {
        this.driver = driver;
    }

    public boolean washed;

    public Vehicle() {
        washed = false;
    }

    public void wash() {
        washed = true;
    }

    public boolean isClean() {
        return washed;
    }

}

