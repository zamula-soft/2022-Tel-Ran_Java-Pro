package lesson3.enums.cards;

import java.util.Random;

public class Dealer {

    private Random r = new Random();

    public Card getCard()
    {
           int rank = r.nextInt(13);
           int suite = r.nextInt(4);
           return new Card(
                   Rank.values()[rank],
                   Suite.values()[suite]
           );

    }
}
