package src.main.java.classroom;

public class NameSurnameCon {
    public static void main(String[] args) {

        String title = "0";
        String firstName = "Nikita";
        String lastName = "Voronin";

        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);

        System.out.println("Name: " + firstName + " " + lastName);

        String nameWithTitle;

        int maried = 1;
        int notMaried = 2;


        switch (title) {
            case "maried":
                nameWithTitle = "Mrs " + firstName + " " + lastName; break;
            case "notMaried":
                nameWithTitle = "Ms " + firstName + " " + lastName; break;
            default:
                nameWithTitle = "Mr " + firstName + " " + lastName; break;
        }
            System.out.println("Full Name with Title: " + nameWithTitle);


    }
}
