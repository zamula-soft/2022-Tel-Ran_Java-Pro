package lesson13;

import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
        String [] groups = new String[] {"Abba", "Sex pistols", "Rem", "Beatles"};

        //equals - boolean
        //to sort  Comparable - interface
        //s1.compareTo(s2) - 0 s1 equals s2
        //1 - s1 > s2, -1 s1 < s2

        System.out.println(Arrays.toString(groups));
        Arrays.sort(groups);
        System.out.println(Arrays.toString(groups));

        List<Player> team = new ArrayList<>(
                Arrays.asList(
                        new Player(14, "Sam", 24),
                        new Player(16, "Bob", 27),
                        new Player(18, "Alex", 37),
                        new Player(27, "Sam", 99),
                        new Player(2, "Marta", 40)
                )
        );

        //by default in class
        System.out.println(team);
        Collections.sort(team);
        System.out.println(team);

        //by rank comparator
        Collections.sort(team, new PlayerRankComparator());
        System.out.println(team);

        //age in class comparator
        Collections.sort(team, new Player.PlayerAgeComparator());
        System.out.println(team);

        //Reverse
        //age in class comparator
        Collections.sort(team, new Player.PlayerAgeComparator().reversed());
        System.out.println(team);

        //Comparator in call place
        Collections.sort(team, new Comparator<Player>() {
            @Override
            public int compare(Player player, Player t1) {
                return 0;
            }
        });

        //Comparator
        Collections.sort(team, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        Comparator<Player> reversedComparator = (o1, o2) -> o2.getName().compareTo(o1.getName());

        //Players bey name and age
        Comparator<Player> ageComparator = (o1,o2) -> Integer.compare(o1.getAge(), o2.getAge());


        team.sort(reversedComparator.reversed().thenComparing(ageComparator.reversed()));
        System.out.println(team);

        //reference method lambda
        team.sort(Comparator.comparing(Player::getAge).reversed().thenComparing(Player::getName).thenComparing(Player::getRank));
        System.out.println(team);



    }


}
