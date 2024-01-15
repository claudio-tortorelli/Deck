package claudiosoft.deck;

/**
 * Deck
 *
 * @author Claudio Tortorelli
 */
public class FrenchDeck extends Deck {

    public FrenchDeck() {
        super();
        for (int iVal = 1; iVal <= 10; iVal++) {
            cards.add(new Card(iVal, Seed.FIORI));
            cards.add(new Card(iVal, Seed.PICCHE));
            cards.add(new Card(iVal, Seed.CUORI));
            cards.add(new Card(iVal, Seed.QUADRI));
        }
        // TODO jack, queen, king
        cards.add(new Card(0, Seed.JOLLY));
        cards.add(new Card(0, Seed.JOLLY));
    }

}
