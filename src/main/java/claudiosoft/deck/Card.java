package claudiosoft.deck;

import claudiosoft.pocbase.BasicConsoleLogger;

/**
 * Deck
 *
 * @author Claudio Tortorelli
 */
public class Card {

    private BasicConsoleLogger logger;

    private int value;
    private Seed seed;

    public Card(int value, Seed seed) {
        this.value = value;
        this.seed = seed;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Seed getSeed() {
        return seed;
    }

    public void setSeed(Seed seed) {
        this.seed = seed;
    }

}
