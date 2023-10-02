package src.main.java.homework;

public class starsInARow {

    public static void main(String[] args) {
        int numRows = 8;
        int numStarsPerRow = 15;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numStarsPerRow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
