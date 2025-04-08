public class DemoDouble {
  public static void main(String[] args) {
    int x = 9;

    //Store a number with decimal places
    // Type: double
    double y = 9.9;

    // ! We cannot store d.p. into integer variable
    // x = 9.9;

    // Store 99.9 into varibale price
    // Store 3 into varible quantity
    // calculat checkout amount

    double price = 99.9;
    int quantity = 3;
    double amount = price * quantity;
    System.out.println(amount); // 299.7000005

    // ! Problem for "double"
    double o1 = 0.1 + 0.2;
    System.out.println(o1); // 0.3000000004

    
    // 10 -> int value
    // 3 -> int value
    // 1. 10 / 3 -> int / int -> int (10 / 3 -> 3)
    // 2. assign result into w (3 -> 3.0)
    double w = 10 / 3;
    System.out.println(w); // 0.3

    // ! double / int -> double
    int score1 = 71;
    int score2 = 82;
    // calculate the average score

    double score = (score1 + score2) / 2.0; // divided by double
    // ! understand why 76.0 but not 76.5
    System.out.println(score);

  }
  
}
