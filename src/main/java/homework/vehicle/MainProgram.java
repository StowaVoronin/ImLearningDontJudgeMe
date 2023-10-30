package src.main.java.homework.vehicle;

public class MainProgram {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];



            vehicles[0] = new Car(4, "ABC123");
            vehicles[0].driver = "Ivan";
            vehicles[1] = new Truck(2, "XYZ789", 5000);
            vehicles[1].driver = "Anton";
            vehicles[2] = new Car(5, "DEF456");
            vehicles[2].driver = "Anna";
            vehicles[3] = new Bicycle(true);
            vehicles[3].driver = "Sergey";
            vehicles[4] = new Car(2, "GHI789");
            vehicles[4].driver = "Inna";
            vehicles[5] = new Sedan(3, "JKL321");
            vehicles[5].driver = "Viktoria";
            vehicles[6] = new Bicycle(false);
            vehicles[6].driver = "Anatoliy";
            vehicles[7] = new Truck(3, "MNO654", 8000);
            vehicles[7].driver = "Evgeny";
            vehicles[8] = new Bicycle(true);
            vehicles[8].driver = "Maxim";
            vehicles[9] = new Car(4, "PQR987");
            vehicles[9].driver = "Ekaterina";


        vehicles[0].wash();
        vehicles[4].wash();
        vehicles[6].wash();
        vehicles[8].wash();



        for (Vehicle vehicle : vehicles) {
            String vehicleInfo = getVehicleInfo(vehicle);
            String washStatus = vehicle.isClean() ? "Is clean" : "Needs a wash";
            System.out.println(getVehicleType(vehicle) + " | " + vehicleInfo + " | " +   washStatus + " | " + "The driver is " + vehicle.driver);


        }

    }


    private static String getVehicleType(Vehicle vehicle) {
        if (vehicle instanceof Bicycle) {
            return "Bicycle";
        } else if (vehicle instanceof Truck) {
            return "Truck";
        } else if (vehicle instanceof Sedan) {
            return "Sedan";
        } else {
        return "Car";}
    }


    private static String getVehicleInfo(Vehicle vehicle) {
         if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            if (bicycle.isFoldable()) {
                return "Is a foldable bike";
            } else {
                return "Is an unfoldable bike";
            }
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            return truck.getPassengersInfo() + " | Load Capacity: " + truck.getLoadCapacity();
        } else if (vehicle instanceof Sedan) {
            Sedan sedan = (Sedan) vehicle;
            return sedan.getPassengersInfo();
        } else if (vehicle instanceof Car) {
                 Car car = (Car) vehicle;
                 return car.getPassengersInfo();
         }
        return "Unknown";
    }


}