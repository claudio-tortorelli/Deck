package claudiosoft.deck;

/**
 * Deck
 *
 * @author Claudio Tortorelli
 */
public class ItalianDeck extends Deck {

    public ItalianDeck() {
        super();
        for (int iVal = 1; iVal <= 10; iVal++) {
            cards.add(new Card(iVal, Seed.BASTONI));
            cards.add(new Card(iVal, Seed.COPPE));
            cards.add(new Card(iVal, Seed.SPADE));
            cards.add(new Card(iVal, Seed.DENARI));
        }
    }

}
