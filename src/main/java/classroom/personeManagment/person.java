package src.main.java.classroom.personeManagment;

public class person {
    String name;
    String lastName;
    int age;
    Boolean maritalStatus; // true = married; false = single


    public person() {
        this.name = "no name";
        this.lastName = "unknown";
        this.age = 0;
        this.maritalStatus = false;

    }

    public person(String name) {
        this.name = name;
        this.lastName = "unknown";
        this.age = 0;
        this.maritalStatus = false;

    }
    public person(String name, String lastname, int age) {
        this.name = name;
        this.lastName = lastname;
        this.age = 0;
        this.maritalStatus = false;

    }
    void celebrateBirthday(){
        this.age++;
    }

    void getMarried() {
        this.maritalStatus=true;
    }

    void getDivorced() {
        this.maritalStatus=false;
    }

}
