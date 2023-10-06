package src.main.java.classroom;

public class calCircle {

    static double calcCircle(double radius) {
        double circumference;
        circumference = 2 * Math.PI * radius;;
        return circumference;
    }
    public static void main(String[] args) {
        double res = calcCircle( 4.56);
        System.out.println("circle circumference is " + res);
    }
}
