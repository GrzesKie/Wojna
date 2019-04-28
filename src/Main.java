import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(createDeck());
        System.out.println("Deck with 5 cards, seed 10: ");
    }

    private static Deck createDeck() {
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < 10 ; i++,
        System.out.println(i)) {
            Card card = createRandomCard();

            cards.add(card);
        }
        Deck deck = new Deck(cards);

        return deck;
    }

    private static Card createRandomCard() {

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println(randomNumber);

        int randomColorNumber = random.nextInt(4);
        CardColor cardColor = CardColor.values()[randomColorNumber];
        System.out.println("Wylosowany numer koloru: " + randomColorNumber);
        System.out.println("Wylosowany kolor to: " + cardColor);

        boolean randomRarity = random.nextBoolean();
        if (randomRarity = true) {
            System.out.println("Karta jest rzadka");
        } else {
            System.out.println("Karta jest zwykła");
        }
        Card card = new Card (randomNumber, cardColor, randomRarity);
        System.out.println(card);

        return card;



        }

    }

