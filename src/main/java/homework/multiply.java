package src.main.java.homework;

public class multiply {
    public static void main(String[] args) {
        int number = 5;

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " * " + i + " = " + product);
        }
    }
}
