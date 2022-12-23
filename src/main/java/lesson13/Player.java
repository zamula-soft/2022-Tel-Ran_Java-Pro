package lesson13;

import java.util.Comparator;

public class Player implements Comparable<Player>{
    private int rank;
    private String name;
    private int age;

    public Player(int rank, String name, int age) {
        this.rank = rank;
        this.name = name;
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "r=" + rank +
                ", n='" + name + '\'' +
                ", a=" + age +
                '}';
    }

    //Comparable - the way to add ability to compare for a class with interface Comparable
    //To add ability to compare with diff fields - add comparator
    //this.compareTo(Player p)
    @Override
    public int compareTo(Player p) {

        return name.compareTo(p.getName());
    }

    public static class PlayerAgeComparator implements Comparator<Player>{

        @Override
        public int compare(Player p1, Player p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

}
