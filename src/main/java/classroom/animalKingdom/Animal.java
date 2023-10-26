package src.main.java.classroom.animalKingdom;

public class Animal {
    private String name; //Cat, dog ect
    private String sound;
    private int age;
    private int weight;

    public Animal(){
        name = "";
        sound = "";
        age = 0;
        weight = 0;
    }

    public Animal(String name){
        this.name = name;
        sound = "";
        age = 0;
        weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String makeSound(){
        return this.sound +" ";
    }

}
