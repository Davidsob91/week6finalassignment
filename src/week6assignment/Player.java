package week6assignment;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private int score;
    private String playerName;

    // Constructor
    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
    }

    // Returns the player's name
    public String getPlayerName() {
        return playerName;
    }

    // Returns the player's score
    public int getScore() {
        return score;
    }

    // Prints player information and their hand
    public void describe() {
        System.out.println("Player: " + playerName);
        System.out.println("Score: " + score);
        System.out.println("Cards in hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Draws a card from the deck
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    // Removes and returns the top card of the player's hand
    public Card flip() {
        return hand.isEmpty() ? null : hand.remove(0);
    }

    // Increases the player's score
    public void incrementScore() {
        score++;
    }
}