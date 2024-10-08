    enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public class Card {
        private String value;
        private Suit suit;

        public Card(String value, Suit suit) {
            this.value = value;
            this.suit = suit;
        }

        @Override
        public String toString() {
            return value + " of " + suit;
        }

        public String getValue() {
            return value;
        }

        public Suit getSuit() {
            return suit;
        }
    }