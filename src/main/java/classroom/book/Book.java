package src.main.java.classroom.book;

public class Book {

    String name;
    String author;
    String publisher;
    int year;
    boolean pg18;

    public Book(){
        this.name = "No name";
        this.author = "Unknown";
        this.year = 2023;
        this.pg18 = false;
    }

    public Book(String author){
        this.name = "No name";
        this.author = author;
        this.year = 2019;
        this.pg18 = true;
    }

    public Book(String author, String name, int year){
        this.name = name;
        this.author = author;
        this.year = year;
        this.pg18 = false;
    }
}
