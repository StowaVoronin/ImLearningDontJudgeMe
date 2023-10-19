package src.main.java.homework.hiringBlueprint;

public class Candidates {
    public static void main(String[] args) {
        Person person1 = new Person ("Charlie");
        Person person2 = new Person ("Tiana", 1998);

        person1.setSurname("White");
        person2.setSurname("Shmidt");

        if (person1.getAge() > 18){
            person1.hire();
        }

        if (person2.getAge() > 18){
            person2.hire();
        }

        person1.makeOlder();
        person2.makeOlder();

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

    }
}
