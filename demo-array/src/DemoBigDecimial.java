import java.math.BigDecimal;

public class DemoBigDecimial {
  public static void main(String[] args) {
    // double + double
    System.err.println(0.1 + 0.2); // 0.3000000004

    // Solution
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);
    System.out.println(bd1);
    System.out.println(bd2);

    // bd1 + bd2 -> 2.2
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3); // 0.3
    System.out.println(bd1); // 0.1
    System.out.println(bd2); // 0.2

    // ! subtract()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println(bd4);

    // ! multiply()
    BigDecimal bd5 = bd1.multiply(bd2);
    System.out.println(bd5);

    // ! divide()
    BigDecimal bd6 = bd1.divide(bd2);
    System.out.println(bd6);;

    // 10 / 3
    // rounding? 3.45 -> 3.4 (HALF_DOWN)? 3.45 -> 3.5 (HALF_UP)?

  }
  
}
