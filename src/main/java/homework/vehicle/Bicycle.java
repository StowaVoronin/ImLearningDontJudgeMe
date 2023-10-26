package src.main.java.homework.vehicle;

public class Bicycle extends Vehicle{

    private boolean foldable;

    public Bicycle(boolean foldable) {
        this.foldable = foldable;
    }

    public boolean isFoldable() {
        return foldable;
    }
}
