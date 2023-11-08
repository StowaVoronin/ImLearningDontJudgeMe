package homework.vehicle;

public class Vehicle {
    String brand;
    String color;
    String driver;
    public Vehicle(){
        this.brand = "";
        this.color = "";
        this.driver = "";
    }
    public String getDriverInfo() {
        return "This vehicle's driver is " + this.driver;
    }
    public String endInfo(){
        return  "_____________________________________";
    }
}
