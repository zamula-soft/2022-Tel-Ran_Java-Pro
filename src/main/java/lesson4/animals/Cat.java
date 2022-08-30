package lesson4.animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    String greets() {
        return "Meow";
    }
}

