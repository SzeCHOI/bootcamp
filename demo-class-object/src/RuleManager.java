public class RuleManager {

  // Input -> Output
  public static boolean isPair(Card c1, Card c2) {
    return c1.getRank() == c2.getRank();
  }

  public static boolean isThreeOfKind(Card c1, Card c2, Card c3) {
    return c1.getRank() == c2.getRank() && c2.getRank() == c3.getRank();
  }

  // given 5 cards
  // 8 7 8 8 7 (3,2,0,0,0,0...)
  public static boolean isFullHouse(Card[] cards) {
    if (cards == null || cards.length != 5)
      return false;
    char[] chs = new char[13];
    // int[] counts = new int[13]; m
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] == null)
        return false;
      chs[cards[i].getRank() - 'A']++;
      // int index = cards[i].getRank() - 'A';
      // counts[index]++;
    }
    // for (int i = 0; i < counts.length; i++)
    // if (counts[i] == 1)
    // return false;
    // return true;
    boolean withThreeKind = false;
    boolean withPair = false;
    for (int i=0; i < chs.length; i ++){
      if (chs[i] ==2) {
        withPair = true;
      }
      if (chs[i] == 3){
        withThreeKind = true;
      }
    }
    return withPair && withThreeKind;
  }

  // 6, 7, 8, 9, 10
  // A, K, Q, J, 10
  public static boolean isStraight(Card[] cards) {
    return false;
  }

  public static boolean isFlush(Card[] cards) {
    if (cards.length != 5)
      return false;
    return cards[0].getSuit() == cards[1].getSuit()
        && cards[0].getSuit() == cards[2].getSuit()
        && cards[0].getSuit() == cards[3].getSuit()
        && cards[0].getSuit() == cards[4].getSuit();
  }

  public static void main(String[] args) {
    Card c1 = new Card(Card.TWO, Card.DIAMOND);
    Card c2 = new Card(Card.THREE, Card.DIAMOND);
    Card c3 = new Card(Card.FOUR, Card.DIAMOND);
    Card c4 = new Card(Card.JACK, Card.DIAMOND);
    Card c5 = new Card(Card.KING, Card.DIAMOND);
    System.out.println(RuleManager.isFlush(new Card[] { c1, c2, c3, c4, c5 })); // true
    Card c6 = new Card(Card.KING, Card.SPADE);
    System.out.println(RuleManager.isFlush(new Card[] { c1, c2, c3, c4, c6 })); // false
    System.out.println(RuleManager.isFlush(new Card[] { c1, c2, c3, c4, c5, c6 })); // false

    Card c7 = new Card(Card.TWO, Card.HEART);
    Card c8 = new Card(Card.KING, Card.HEART);

      Card [] cards = new Card[] {c1, c2, c3, c4, c5};
    cards = new Card[] {c2, c3, c4, c5, c6};

    System.out.println(RuleManager.isFullHouse(new Card[] { c1, c5, c7, c8, c6 }));
  }

}
