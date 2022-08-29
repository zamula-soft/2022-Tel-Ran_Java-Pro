package lesson3.enums.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Scanner scanner = new Scanner(System.in); //read from console

        List<Card> deck = new ArrayList<>();

        do {
            Card card = dealer.getCard();
            deck.add(card);

            System.out.println("Card: " + card);
            int score = 0;
            for (Card value : deck) {
                score += value.getValue();
            }
            System.out.println("Your score: " + score );

            System.out.println("Press N to quit");

            if (score >= 21) {
                System.out.println("You are lose!");
                break;
            }

        } while (!scanner.next().equals("N"));
    }
}
