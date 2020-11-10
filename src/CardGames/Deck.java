package CardGames;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final static String[] SUITS = {}; //SEARCCH UNICODE FOR THE SUITES
    //THIS EXISTS MARGIE DONT FORGET
    private final static int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    //values
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (var suit : SUITS) {
            for (var value : VALUES) {
                cards.add(new Card(value, suit));
            }
        }
    }
}
