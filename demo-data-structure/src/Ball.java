import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private int num;
  private Colour colour;

  // constructor
  public Ball(int num, Colour colour) {
    this.colour = colour;
    this.num = num;
  }

  // @Override
  // public int compareTo(Ball ball) {
  // -1 -> this go first
  // 1 -> ball go first
  // if (this.num > ball.getNum())
  // return -1;
  // return 1;
  // }

  @Override
  public int compareTo(Ball ball) {
    if (this.colour == Colour.BLUE)
      return -1;
    if (ball.getColour() == Colour.BLUE)
      return 1;
    if (this.colour == Colour.YELLOW)
      return -1;
    return 1;
  }

  // getter
  public Colour getColour() {
    return this.colour;
  }

  public int getNum() {
    return this.num;
  }

  public static enum Colour {
    RED, BLUE, YELLOW;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "Ball("
        + num + " , " + colour + ")";
  }

  public static void main(String[] args) {
    // 3 Balls in ArrayList (diff in colour and value)
    List<Ball> balls = new ArrayList<>();
    Ball b1 = new Ball(3, Colour.BLUE);
    balls.add(b1);
    balls.add(new Ball(1, Colour.YELLOW));
    balls.add(new Ball(-5, Colour.RED));

    b1.setNum(7);
    System.out.println(b1.getNum()); // 7
    System.out.println(balls.get(0).getNum()); // 7

    balls.get(0).setNum(9);
    System.out.println(b1.getNum()); // 9

    // for-each print balls
    for (Ball ball : balls) {
      System.out.println(ball);
    }

    // Java default Sorting Usage:
    Collections.sort(balls); // Collections.sort() requires a class fulfill Comparable Interface.
    System.out.println(balls);
  }
}
