package src.main.java.homework;

public class Fibonacci {
    public static void main(String[] args) {
        int[] fibonacciArray = new int[11];
        calculateFibonacci(fibonacciArray);
        printArray(fibonacciArray);
    }

    public static void calculateFibonacci(int[] arr) {

        arr[0] = 1;
        arr[1] = 1;


        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        }

    public static void printArray(int[] arr) {
        System.out.println("First 11 Fibonacci Numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Fibonacci[" + i + "] = " + arr[i]);
        }
    }
}
