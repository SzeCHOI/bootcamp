public class Ball {
  private Colour colour;
  private int number;

  public Ball(Colour colour, int number){
    this.colour = colour;
    this.number = number;
  }

  public static enum Colour{
    RED, BLUE;
  }

  @Override
  public String toString(){
    return "Ball( "
    + "colour = " + this.colour.name()
    + ", number= " + this.number
    + " )";
  }
}
