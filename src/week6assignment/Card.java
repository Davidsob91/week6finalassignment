package week6assignment;

public class Card {

    private int value;   // The value of the card (2-14)
    private String name; // The name of the card (e.g., "Ace of Diamonds", "Two of Hearts")

    // Constructor to initialize the card with a value and name
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getter for card value
    public int getValue() {
        return value;
    }

    // Setter for card value
    public void setValue(int value) {
        this.value = value;
    }

    // Getter for card name
    public String getName() {
        return name;
    }

    // Setter for card name
    public void setName(String name) {
        this.name = name;
    }

    // Method to describe the card (prints out the card's name and value)
    public void describe() {
        System.out.println(name + " with value " + value);
    }
}