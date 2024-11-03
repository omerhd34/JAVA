package method.mains2.project9;

import java.util.Random;

public class DeckOfCards {

    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[NUMBER_OF_CARDS];
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}
/*
Eight of Diamonds  Queen of Clubs     Four of Hearts     Ace of Diamonds    
Nine of Spades     Five of Clubs      Ten of Hearts      King of Diamonds   
Six of Clubs       Nine of Clubs      King of Spades     Deuce of Hearts    
Nine of Hearts     Three of Diamonds  Seven of Diamonds  Ace of Hearts      
Three of Spades    Eight of Clubs     Queen of Diamonds  Three of Clubs     
Ten of Diamonds    Deuce of Clubs     Ten of Clubs       Ace of Clubs       
Five of Spades     Ten of Spades      Four of Clubs      Three of Hearts    
Ace of Spades      Queen of Hearts    Seven of Spades    Deuce of Spades    
Six of Diamonds    Five of Diamonds   Queen of Spades    Six of Spades      
Four of Diamonds   Eight of Spades    Seven of Hearts    Four of Spades     
Jack of Hearts     Five of Hearts     Jack of Spades     Nine of Diamonds   
King of Clubs      Deuce of Diamonds  Six of Hearts      King of Hearts     
Jack of Diamonds   Seven of Clubs     Eight of Hearts    Jack of Clubs     
 */
