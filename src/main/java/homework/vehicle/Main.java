package homework.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle bmw = new Vehicle();
        bmw.driver = "Arthur";
        System.out.println(bmw.getDriverInfo());
        System.out.println(bmw.endInfo());

        Truck volvo = new Truck();
        volvo.loadUp(880);
        volvo.color = "White";
        System.out.println("This truck's maximum load is "+ volvo.maxLoad + "Kg");
        System.out.println(volvo.endInfo());

        Bicycle aist = new Bicycle();
        aist.isFoldable = false;
        System.out.println("Is it foldable " + aist.isFoldable);
        System.out.println("This bike has " + aist.gearCount + " gears");
        System.out.println(aist.endInfo());

        Sedan mercedes = new Sedan();
        mercedes.driver = "Anna";
        mercedes.licensePlate = "NK 199";
        System.out.println( mercedes.getDriverInfo());
        mercedes.wash();
        System.out.println("This car has "+ mercedes.seats + " seats");
        System.out.println(mercedes.endInfo());

        Car porsche = new Car();
        porsche.licensePlate = "TR 4629";
        porsche.wash();
        System.out.println(porsche.endInfo());

        Vehicle harleyDavidson = new Vehicle();
        harleyDavidson.driver = "David";
        harleyDavidson.color = "Chrome";
        System.out.println(harleyDavidson.getDriverInfo());
        System.out.println(harleyDavidson.endInfo());

        Truck dodge = new Truck();
        dodge.driver = "Samuel";
        dodge.color = "Black";
        dodge.licensePlate = "RT 2917";
        dodge.loadUp(380);
        System.out.println(dodge.getDriverInfo());
        System.out.println("This truc's maximum load is " + dodge.maxLoad + "Kg");
        dodge.wash();
        System.out.println(dodge.endInfo());

        Bicycle trek = new Bicycle();
        trek.driver = "Vika";
        trek.isFoldable = true;
        System.out.println(trek.getDriverInfo());
        System.out.println("Is it foldable" + aist.isFoldable);
        System.out.println("This bike has " + aist.gearCount + " gears");
        System.out.println(trek.endInfo());

        Car vw = new Car();
        vw.licensePlate ="RE 6302";
        vw.wash();
        System.out.println(vw.endInfo());

        Sedan audi = new Sedan();
        audi.driver = "Alexander";
        audi.licensePlate = "LP 3647";
        System.out.println(audi.getDriverInfo());
        audi.wash();
        System.out.println("This car has "+ audi.seats + " seats");
        System.out.println(audi.endInfo());






    }
}
