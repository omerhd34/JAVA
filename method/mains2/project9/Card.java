package method.mains2.project9;

public class Card {

    private String face;
    private String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return face + " of " + suit;
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
