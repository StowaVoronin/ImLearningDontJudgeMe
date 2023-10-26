package src.main.java.homework.vehicle;

public class Vehicle {


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

