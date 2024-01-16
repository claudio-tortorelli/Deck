package claudiosoft.deck;

import claudiosoft.pocbase.POCException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Deck
 *
 * @author Claudio Tortorelli
 */
public class Deck {

    protected List<Card> cards;
    private final Random rand;

    public Deck() {
        cards = new LinkedList<>();
        rand = new Random(new Date().getTime());
    }

    public int size() {
        return cards.size();
    }

    public Deck shuffle(Shuffle shuffle) {
        return shuffle(shuffle, 1);
    }

    public Deck shuffle(Shuffle shuffle, int iterations) {
        List<Card> firstPart = new LinkedList<>();
        List<Card> secondPart = new LinkedList<>();

        int deckSize = cards.size();

        for (int iShuffle = 0; iShuffle < iterations; iShuffle++) {
            if (shuffle.equals(Shuffle.STANDARD)) {
                for (int i = 0; i < deckSize / 2; i++) {
                    firstPart.add(cards.get(i));
                }
                for (int i = deckSize / 2; i < deckSize; i++) {
                    secondPart.add(cards.get(i));
                }
                cards.clear();
                for (int i = 0; i < deckSize / 2; i++) {
                    if (rand.nextInt(2) % 2 == 0) {
                        cards.add(firstPart.get(i));
                        cards.add(secondPart.get(i));
                    } else {
                        cards.add(secondPart.get(i));
                        cards.add(firstPart.get(i));
                    }
                }

            }
        }
        return this;
    }

    public Deck breakIt() {
        //TODO, smezza il mazzo
        return this;
    }

    /**
     * get a card but don't remove it from deck
     *
     * @return Card
     */
    public Card viewCard(int iCard) throws POCException {
        if (iCard < 0 || iCard >= cards.size()) {
            throw new POCException("invalid card index");
        }
        return cards.get(iCard);
    }

    public Card pullCard() {
        Card nextCard = cards.get(0);
        cards.remove(0);
        return nextCard;
    }

    public Deck insertCardUnder(Card card) {
        //TODO last pos
        return this;
    }

    public Deck insertCardInto(Card card) {
        //TODO randomly inside
        return this;
    }

}
