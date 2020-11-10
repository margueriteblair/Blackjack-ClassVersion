package CardGames;

import java.util.Scanner;

public class RiggedDeck extends Deck {

    @Override
    public void shuffle() {
        return;
    }

    @Override
    public Card draw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card value 1-13");
        int value = scanner.nextInt();
        System.out.println("Pick a suit: 1-4");
        String suit = scanner.nextLine();
        return new Card(value, suit); //they simply see what card they want
        //we can use this to get a perfect outcome
    }
}
