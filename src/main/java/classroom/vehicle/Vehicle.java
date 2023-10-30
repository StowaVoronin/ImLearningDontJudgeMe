package src.main.java.classroom.vehicle;

public class Vehicle {
        private String brand;
        private String color;
        private String driver;
        public Vehicle(){
            this.brand = " ";
            this.color = " ";
            this.driver = " ";

        }

    public String getDriverInfo() {
        return "This vehicle driver is " + this.driver;
    }

    }

