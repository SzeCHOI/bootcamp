public class Candy {
  private String colour;

  public Candy(String colour){
    this.colour = colour;
  }

  public String getColour(){
    return this.colour;
  }

  public String toString(){
    return "Candy (" + "colour = " + this.colour + ")";
  }
}
