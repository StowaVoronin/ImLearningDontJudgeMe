package src.main.java.homework.hiringBlueprint;

public class PersonArray {

    public static void main(String[] args) {
        String [] names = {"Artyom", "Irina","Arslan", "Alexandra", "Dina", "Elis", "Gleb", "Anna", "Ilona","Alexey"};
        int[] birthYears = {1995, 1992, 1997, 1993, 1990, 2003, 1988, 1991, 1987, 1985};
        Person[] people  = new Person[names.length];

        for (int i = 0; i < names.length; i++) {
            if (birthYears[i] > 0) {
                people[i] = new Person(names[i], birthYears[i]);
            } else {
                people[i] = new Person(names[i]);
            }

        }

        setHiringStatus(people);
        celebrateNewYear(people);

        for (Person person : people){
            System.out.println(person);
        }
    }

    public static void setHiringStatus(Person[] people) {
        for (Person person : people){
            if (person.getAge() >= 18 && person.getAge() <= 65) {
                person.hire();
            } else {
                person.fire();
            }

        }

    }

    public static void celebrateNewYear(Person[] people) {

        for (Person person : people){
            person.makeOlder();
        }
        setHiringStatus(people);

    }

}
