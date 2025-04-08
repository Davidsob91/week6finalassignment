package week6assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards; // List to store the cards in the deck

    // Constructor to create a standard deck of 52 cards
    public Deck() {
        cards = new ArrayList<>(); // Initialize the list of cards
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};

        // Create each card and add it to the deck
        for (String suit : suits) {
            int value = 2; // Value starts from 2 (Two)
            for (String name : names) {
                String cardName = name + " of " + suit;
                Card card = new Card(value, cardName); // Create a new card
                cards.add(card); // Add the card to the deck
                value++; // Increment the value for the next card
            }
        }
    }

    // Getter for the cards in the deck
    public List<Card> getCards() {
        return cards;
    }

    // Shuffle the deck using Collections.shuffle()
    public void shuffle() {
        Collections.shuffle(cards); // Shuffle the cards list
    }

    // Describe all cards in the deck
    public void describe() {
        for (Card card : cards) {
            card.describe(); // Call describe on each card to print its details
        }
    }

    // Draw a card from the top of the deck (remove and return the first card)
    public Card draw() {
        if (cards.isEmpty()) {
            return null; // If no cards are left to draw
        }
        return cards.remove(0); // Remove and return the first card from the deck
    }
}