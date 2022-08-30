package lesson4.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    String greets() {
        return "Gaf";
    }

    String greets(Dog another){
        return "GafGaf";
    }
}
