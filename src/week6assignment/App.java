package week6assignment;

public class App {

    public static void main(String[] args) {
        // Instantiate the deck and print the description of the cards
        Deck deck = new Deck(); 
        System.out.println("Standard Deck of 52 Cards");
        deck.describe();  // Show all the cards in the deck
        System.out.println();

        // Instantiate two players
        Player player1 = new Player("Player 1"); 
        Player player2 = new Player("Player 2");

        // Print initial description of each player
        player1.describe();  
        player2.describe();  
        System.out.println();

        // Shuffle the deck
        deck.shuffle();
        System.out.println("Deck shuffled\n");

        // Distribute the cards to each player, alternating between them
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);  // Player 1 draws a card
            } else {
                player2.draw(deck);  // Player 2 draws a card
            }
        }

        // Play 26 rounds of the game
        for (int round = 0; round < 26; round++) {
            System.out.println("Round " + (round + 1) + ":");

            // Each player flips a card
            Card p1Card = player1.flip();
            Card p2Card = player2.flip();

            // Print the cards each player flipped
            if (p1Card != null) {
                System.out.println(player1.getPlayerName() + " flipped: ");
                p1Card.describe();
            }

            if (p2Card != null) {
                System.out.println(player2.getPlayerName() + " flipped: ");
                p2Card.describe();
            }

            // Compare the cards and update the score
            if (p1Card.getValue() > p2Card.getValue()) {
                player1.incrementScore();  // Player 1 wins the round
                System.out.println(player1.getPlayerName() + " wins the round!");
            } else if (p2Card.getValue() > p1Card.getValue()) {
                player2.incrementScore();  // Player 2 wins the round
                System.out.println(player2.getPlayerName() + " wins the round!");
            } else {
                System.out.println("It's a tie! No point awarded this round.");
            }
        }

        // After 26 rounds, display the final score
        System.out.println("\nFinal score:");
        System.out.println(player1.getPlayerName() + ": " + player1.getScore());
        System.out.println(player2.getPlayerName() + ": " + player2.getScore());

        // Determine the winner of the game
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getPlayerName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getPlayerName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}