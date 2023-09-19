package src.main.java.homework;

public class PetsAge {
    public static void main(String[] args) { //I created a runnable main method
        int me = 31; // I Declared the variables of my age
        int pet = 2; // I Declared the variables of my dogs age

        System.out.println("My age and my dogs age(in human years)");// Gave the first line of text. The title
        int age; // I Declared the age of my dog in human years
        age = pet * 7; //I Calculated my dog's age in «human» years based on assumption that one dog’s year = 7 human years

        System.out.println("Hello, I'm Nikita, and I'm " + me + " years old");// I provided some information text with the first variable(between the text)
        System.out.println("And this is Hamlet, he is " + age + " years old");// I provided some information text with the third variable(between the text)
        System.out.println("... in dog years. He is actually only " + pet + ".");// I provided some information text with the second variable

        System.out.println("But, if i was a dog");// Just added some mor text
        float iF; // I Declared my age in dog years with a more accurate result
        iF = (float)me/7;// Devided my age by 7
        System.out.println("I'd be " + iF + ". Ha! Isn't that something.");// Presented the result between text
        System.out.println("Anyway, have a nice day.");// Added some farwell text

    }
}
