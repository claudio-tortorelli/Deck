package claudiosoft.deck;

/**
 * Deck
 *
 * @author Claudio Tortorelli
 */
public enum Seed {

    // https://it.wikipedia.org/wiki/Carte_da_gioco_italiane
    COPPE("COPPE", "♥"),
    BASTONI("BASTONI", "♣"),
    SPADE("SPADE", "♠"),
    DENARI("DENARI", "♦"),
    // https://it.wikipedia.org/wiki/Carte_da_gioco#Semi_francesi
    CUORI("CUORI", "♥"),
    FIORI("FIORI", "♣"),
    PICCHE("PICCHE", "♠"),
    QUADRI("QUADRI", "♦"),
    JOLLY("JOLLY", "*");

    private String desc;
    private String symbol;

    private Seed(String desc, String symbol) {
        this.desc = desc;
        this.symbol = symbol;
    }

    public String getDesc() {
        return desc;
    }

    public String getSymbol() {
        return symbol;
    }
}
