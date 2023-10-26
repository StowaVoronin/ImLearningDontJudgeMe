package src.main.java.classroom.animalKingdom;

public class Cat extends Animal{
    public boolean isStriped() {
        return isStriped;
    }
    public Cat() {
        super("Cat");
        super.setSound("Mew");
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

    boolean isStriped;



}
