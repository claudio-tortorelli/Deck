
/**
 *
 *
 */
import claudiosoft.deck.Card;
import claudiosoft.deck.ItalianDeck;
import claudiosoft.pocbase.BasicConsoleLogger;
import claudiosoft.pocbase.POCException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDeck extends BaseJUnitTest {

    @Test
    public void t01BuildItalianDeck() throws POCException {
        ItalianDeck deck = new ItalianDeck();

        BasicConsoleLogger.get().info("Italian deck is composed by");
        int totCard = deck.size();
        for (int i = 0; i < totCard; i++) {
            Card card = deck.pullCard();
            BasicConsoleLogger.get().info(String.format("%d %s", card.getValue(), card.getSeed().getDesc()));
        }
    }

}
