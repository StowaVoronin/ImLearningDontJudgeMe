package src.main.java.classroom.book;

public class bookOrder {

    public static void main(String[] args) {
        Book ABC = new Book();
        ABC.name = "The Alphabet";
        System.out.println(ABC.name + ABC.year);

        Book LC = new Book();
        LC.name = "The best of ";
        System.out.println(LC.name + LC.author + LC.pg18);


    }
}
