package src.main.java.homework;

public class ArrayMethod {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(numbers);

        increaseByFive(numbers);

        System.out.println("Updated Array:");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void increaseByFive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
    }
}
