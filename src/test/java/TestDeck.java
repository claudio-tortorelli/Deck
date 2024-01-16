
/**
 *
 *
 */
import claudiosoft.deck.Card;
import claudiosoft.deck.ItalianDeck;
import claudiosoft.deck.Shuffle;
import claudiosoft.pocbase.BasicConsoleLogger;
import claudiosoft.pocbase.POCException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDeck extends BaseJUnitTest {

    @Test
    public void t01ViewItalianDeck() throws POCException {
        ItalianDeck deck = new ItalianDeck();

        BasicConsoleLogger.get().info("Italian deck is composed by");
        int totCard = deck.size();
        for (int i = 0; i < totCard; i++) {
            Card card = deck.viewCard(i);
            BasicConsoleLogger.get().info(String.format("%d %s", card.getValue(), card.getSeed().getDesc()));
        }
    }

    @Test
    public void t02ShuffleItalianDeck() throws POCException {
        ItalianDeck deck = new ItalianDeck();
        deck.shuffle(Shuffle.STANDARD);

        BasicConsoleLogger.get().info("shuffled deck is composed by");
        int totCard = deck.size();
        for (int i = 0; i < totCard; i++) {
            Card card = deck.viewCard(i);
            BasicConsoleLogger.get().info(String.format("%d %s", card.getValue(), card.getSeed().getDesc()));
        }
    }

    @Test
    public void t03ShuffleItalianDeckMoreTimes() throws POCException {
        ItalianDeck deck = new ItalianDeck();
        deck.shuffle(Shuffle.STANDARD, 6);

        BasicConsoleLogger.get().info("shuffled deck is composed by");
        int totCard = deck.size();
        for (int i = 0; i < totCard; i++) {
            Card card = deck.viewCard(i);
            BasicConsoleLogger.get().info(String.format("%d %s", card.getValue(), card.getSeed().getDesc()));
        }
    }

}
