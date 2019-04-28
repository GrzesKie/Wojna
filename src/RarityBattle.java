public class RarityBattle implements Battle {

    @Override
    public int checkWinner(Deck deck, Deck secondDeck) {
        RarityBattle rarityBattle = new RarityBattle();
        int numberOfRareCardsInDeckOne = rarityBattle.calculateRareCardNumber(deck);
        int numberOfRareCardsInDeckTwo = rarityBattle.calculateRareCardNumber(secondDeck);

        if (numberOfRareCardsInDeckOne > numberOfRareCardsInDeckTwo) {
            System.out.println("Zwyciężyła talia nr 1");
            System.out.println("Liczba kart rzadkich to " + numberOfRareCardsInDeckOne);
            return 1;
        } else if (numberOfRareCardsInDeckTwo > numberOfRareCardsInDeckOne) {
            System.out.println("Zwyciężyła talia nr 2");
            System.out.println("Liczba rzadkich kart to " + numberOfRareCardsInDeckTwo);
            return -1;
        } else
            System.out.println("Remis");
        return 0;
    }

    private int calculateRareCardNumber(Deck deck) {
        int counter = 0;

        for (Card card : deck.getCards()) {
            if (card.isRarity()) {
                counter++;
            }

        }
        return counter;
    }
}



