import java.awt.*;

public class ColorBattle implements Battle {

    @Override
    public int checkWinner(Deck deck, Deck secondDeck) {
        ColorBattle colorBattle = new ColorBattle();
        int ValueOfColorsOne = colorBattle.calculateColorValue(deck);
        int ValueOfColorsTwo = colorBattle.calculateColorValue(secondDeck);
        if (ValueOfColorsOne > ValueOfColorsTwo) {
            return 1;
        } else if (ValueOfColorsOne < ValueOfColorsTwo) {
            return -1;
        } else {

            return 0;
        }
    }

    private int calculateColorValue(Deck deck) {
        int counterColor = 0;

        for (Card card : deck.getCards()) {
            counterColor += card.getColor().getValue();
        }

        return counterColor;
    }
}
