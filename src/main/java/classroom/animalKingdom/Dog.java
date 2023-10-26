package src.main.java.classroom.animalKingdom;

public class Dog extends Animal{
    String breed;

    public Dog(){
        super("Dog");
        super.setSound("woof");

    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}

