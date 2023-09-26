package src.main.java.homework;

public class starsInARow {

    public static void main(String[] args) {

        int numRows = 8;
        int numColumns = 15;

        for ( int a = 0; a < numRows; a++){
            for (int b = 0; b < numColumns; b++){
                System.out.println("* ");
            }
            System.out.println();
        }

    }
}
