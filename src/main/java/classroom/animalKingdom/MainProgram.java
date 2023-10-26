package src.main.java.classroom.animalKingdom;

public class MainProgram {
    public static void main(String[] args) {
        Animal cow = new Animal();
        cow.setSound("Moo");
        System.out.println(cow.makeSound());

        Dog tuzik = new Dog();
        System.out.println(tuzik.makeSound());

        Cat murzik = new Cat();
        System.out.println(murzik.makeSound());
    }
}
