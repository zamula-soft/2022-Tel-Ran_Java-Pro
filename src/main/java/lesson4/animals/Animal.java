package lesson4.animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String greets();



}
