package src.main.java.homework.hiringBlueprint;

public class Person {

    String name;
    String surname;
    int age;
    boolean isHired;

    public Person(String name, int birthYear ) {
        this.name = name;
        this.age = 2023 - birthYear;
        this.isHired = false;
    }
    public Person(String name){
        this.name = name;
        this.age = 0;
        this.isHired = false;
    }
    public void hire(){
        isHired = true;

    }

    public void fire(){
        isHired = false;
    }

    public void makeOlder(){
        age++;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return  "Person: " +
                "name - " + name + " / " +
                "surname - " + surname + " / " +
                "age - " + age + " / " +
                "is hired - " + isHired;
    }





}
