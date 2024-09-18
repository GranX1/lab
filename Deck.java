import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private List<Card> dealtCards;

    public Deck() {
        resetDeck();
        this.dealtCards = new ArrayList<>();
    }

    public void resetDeck() {
        cards = new ArrayList<>();
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (Suit suit : Suit.values()) {
            for (String value : values) {
                cards.add(new Card(value, suit));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public List<Card> dealCards(int numberOfCards) {
        List<Card> dealt = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            if (cards.size() > 0) {
                Card card = cards.remove(0);
                dealt.add(card);
                dealtCards.add(card);
            }
        }
        return dealt;
    }

    public void returnCards(List<Card> returnedCards) {
        cards.addAll(returnedCards);
        dealtCards.removeAll(returnedCards);
    }

    public List<Card> getRemainingCards() {
        return new ArrayList<>(cards);
    }

    public List<Card> getDealtCards() {
        return new ArrayList<>(dealtCards);
    }
}
