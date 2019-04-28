public class Card {

    private int value;
    private CardColor color;
    private boolean rarity;

    public Card(int value, CardColor color, boolean rarity) {
        this.value = value;
        this.color = color;
        this.rarity = rarity;
    }

    public CardColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", color=" + color +
                ", rarity=" + rarity +
                '}';
    }

    public boolean isRarity() {
        return rarity;
    }
}

