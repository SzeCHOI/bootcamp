public class Card {
  private Colour colour;

  public Card(Colour colour) {
    this.colour = colour;
  }

  public Colour getColour() {
    return this.colour;
  }

  public static void main(String[] args) {
    Card c1 = new Card(Colour.YELLOW);
    Card c2 = new Card(Colour.YELLOW);
    Card c3 = new Card(Colour.RED);

    System.out.println(c1.getColour()); // Yellow
    System.out.println(c1.getColour().name()); // YELLOW

    //c1 and c2 they are using same Colour object
    System.out.println(c1.getColour() == c2.getColour()); // ture
  }
}
