/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @modifier Mansi thakor
 * @student number - 991736225
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[random.nextInt(4)]); 
            magicHand[i] = c; 
        }
        
        // Ask the user for a card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.println("Pick a suit (0: Hearts, 1: Diamonds, 2: Spades, 3: Clubs): ");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];
        
        // Search the magic hand for the user's card
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
    Card luckyCard = new Card();
luckyCard.setValue(2);
luckyCard.setSuit("Clubs");

boolean found = false;
for (Card card : magicHand) {
    if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
        found = true;
        break;
    }
}

// Report the result
if (found) {
    System.out.println("You win! The lucky card is in the magic hand.");
} else {
    System.out.println("You lose. The lucky card is not in the magic hand.");
}
}
