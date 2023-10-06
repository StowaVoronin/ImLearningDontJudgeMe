package src.main.java.classroom;

public class circleCalMethod {
    static double diameter(double radius) {
        double diameter;
        diameter = radius * 2;
        return diameter;
    }
    static double area(double radius) {
        double area;
        area = radius * radius * Math.PI;
                return area;


    }

    public static void main(String[] args) {
        double res = area(4.56);
        double ar = diameter(4.56);
        System.out.println("circle area is " + res + "cm^2");
        System.out.println("circle diameter is " +ar + "cm");

    }
}
