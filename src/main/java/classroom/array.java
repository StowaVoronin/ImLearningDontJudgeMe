package src.main.java.classroom;

public class array {
    public static void main(String[] args) {
        int[] numb = {-5, -3, 0, 3, 16, 36, 195, 999, 1000, 4672};
        for (int i = 0; i < numb.length; i++) {
            System.out.println(numb[i]);
        }
        for (int a = 0; a < numb.length; a++) {
            numb[a] = (numb[a] + 5);
            System.out.println(numb[a]);
        }
    }
}
