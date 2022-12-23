package lesson13;

import java.util.*;

public class Cat implements Comparable<Cat>{
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(
                Arrays.asList(
                        new Cat(Breed.BURNESE, 12, "Max" ),
                        new Cat(Breed.SIAMES, 8, "Tihon"),
                        new Cat(Breed.BURNESE, 8, "Alex")
                )
        );
        System.out.println(cats);
        Collections.sort(cats);
        System.out.println(cats);
        cats.sort((cat1, cat2) -> cat1.getAge() - cat2.getAge());

        cats.sort((cat1, cat2) -> cat2.getName().compareTo(cat1.getName()));

        cats.sort(Comparator.comparing(Cat::getBreed).thenComparing(Cat::getAge).thenComparing(Cat::getName));
        System.out.println(cats);
    }

    @Override
    public int compareTo(Cat cat) {
        return Integer.compare(this.age, cat.getAge());
    }

    public enum Breed {
        SIAMES, BURNESE, SIBERIAN, SPHINX
    };
    private Breed breed;
    private int age;
    private String  name;



    @Override
    public String toString() {
        return "Cat{" +
                "breed=" + breed +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat(Breed breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }


    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
