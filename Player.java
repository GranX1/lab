import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;  
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void receiveCards(List<Card> cards) {
        hand.addAll(cards);
    }

    public List<Card> returnCards() {
        List<Card> returnedCards = new ArrayList<>(hand);
        hand.clear();
        return returnedCards;
    }

    // Getter para el nombre
    public String getName() {
        return name;
    }

    // Setter para el nombre
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player: " + name + ", Hand: " + hand;
    }
}
