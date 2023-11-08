package homework.vehicle;

public class Bicycle extends Vehicle{
    boolean isFoldable;
    int gearCount;

    public Bicycle() {
        super();
        this.isFoldable = true;
        this.gearCount = 1;
    }
    public boolean fold() {
        if (this.isFoldable) return false;
        else {
                this.isFoldable = true;
                return true;

        }
    }
}
