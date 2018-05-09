package CardGames;

public class Card {

    public Card (){}

    protected String suit;
    protected int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() { // override
        return value + " of " + suit;
    }
}
