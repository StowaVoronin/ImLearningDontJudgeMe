package src.main.java.classroom.vehicle;


public class Truck extends Car{
    int maxLoad;


public Truck() {
    super();
    maxLoad = 0;


}

public void  loadUp(int amount) {
    System.out.println("uck has been loaded by " + amount);
    this.maxLoad = this.maxLoad + amount;
}


}
