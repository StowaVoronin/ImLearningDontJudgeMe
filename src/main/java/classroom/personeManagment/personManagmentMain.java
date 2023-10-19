package src.main.java.classroom.personeManagment;

public class personManagmentMain {
    public static void main(String[] args) {
        person kate = new person();

        kate.name = "Jekaterina";
        kate.name = kate.name + " Gulbinove";
        System.out.println(kate.name);

        person mike = new person();
        mike.name = "Michael";

        System.out.println(kate.name + "; " + mike.name);
        kate.name = "";
        System.out.println(kate.name + "; " + mike.name);

        mike.getMarried();

        kate.age = 42;

        kate.celebrateBirthday();
        System.out.println("ate now is " + kate.age);
    }
}
