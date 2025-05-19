import java.util.Comparator;

// Comparator -> formula 
public class SortedByColour implements Comparator<Ball>{
  
  @Override
  public int compare(Ball b1, Ball b2){
    // -1 -> b2
    // 1 -> b1
    // ascending order
    return b1.getNum() < b2.getNum() ? -1: 1;
  }
}
