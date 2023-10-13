package src.main.java.homework;
import java.util.Random;
class BubblesMethod {
    public static void main(String[] args) {
        int[] numbers = generateRandomArray(10);

        System.out.println("Initial Array: ");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nSorted Array: ");
        printArray(numbers);



    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1 ] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }

        }

    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); //
        }

        return arr;

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
