import java.util.Arrays;

public class Deck {
  private static final char[] SUITS = new char[] { Card.DIAMOND, Card.CLUB, Card.HEART, Card.SPADE };
  private static final char[] RANKS = new char[] { Card.ACE, Card.TWO, Card.THREE, Card.FOUR, Card.FIVE, Card.SIX,
      Card.SEVEN, Card.EIGHT, Card.NINE, Card.TEN, Card.JACK, Card.QUEEN, Card.KING };

  private Card[] cards; // null

  // constructor
  public Deck() {
    this.cards = new Card[SUITS.length * RANKS.length];
    int idx = 0;
    for (int i = 0; i < SUITS.length; i++) {
      for (int j = 0; j < RANKS.length; j++) {
      this.cards[idx] = new Card(RANKS[j], SUITS[i]);
      idx++;
      }
    }
  }

  // getter
  public Card[] getCards() {
    return this.cards;
  }
  // setter

  public static void main(String[] args) {
    Deck d1 = new Deck();
    System.out.println(Arrays.toString(d1.getCards()));
  }
}
