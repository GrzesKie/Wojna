public interface Battle {

    int checkWinner (Deck deck, Deck secondDeck);

    default void sing() {
        System.out.println("Spiewam");
    }
}
