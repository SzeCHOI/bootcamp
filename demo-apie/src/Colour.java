public enum Colour {
  // ! 1. Finite values
  // ! 2. Not usually changes
  RED(1, 'R'),
  YELLOW(2, 'Y'),
  BLUE(3, 'B');

  private int value;
  private char ch;

  private Colour(int value, char ch) {
    this.value = value;
    this.ch = ch;
  }
}
