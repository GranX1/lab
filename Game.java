public class Game {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();

        Player player1 = new Player("Mike");
        Player player2 = new Player("Quiroz");

        // Cambiar el nombre de player1
        player1.setName("Miguel");

        player1.receiveCards(deck.dealCards(5));
        player2.receiveCards(deck.dealCards(5));

        System.out.println(player1);
        System.out.println(player2);

        System.out.println("Remaining cards: " + deck.getRemainingCards().size());

        deck.returnCards(player1.returnCards());
        deck.returnCards(player2.returnCards());

        System.out.println("Dealt cards: " + deck.getDealtCards().size());
        System.out.println("Remaining cards: " + deck.getRemainingCards().size());
    }
}
