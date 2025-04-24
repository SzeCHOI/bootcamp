import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {
    // array + for loop
    // find max
    int[] arr = new int[] { 100, -20, 200, 17 };
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);

    // Approach 2 (Math)
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    System.out.println(max); // 200

    // equals(), length(), charAt()

    // convert from char[] to Stirng
    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs)); // [h, e, l, l, o]

    // covert l to x
    // "hello" -> "hexxo"
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 'l') {
        chs[i] = 'x';
      }
    }
    System.out.println(Arrays.toString(chs)); // [h, e, x, x, o]

    // convert from char[] to String
    System.out.println(String.valueOf(chs)); // "hexxo"

    System.out.println("hello".replace('l', 'x')); // "hexxo"

    System.out.println("hello".equals("Hello")); // false
    System.out.println("hello".equalsIgnoreCase("Hello")); // true
    System.out.println("hello".equalsIgnoreCase("Hexlo")); // false
    System.out.println("hello".equalsIgnoreCase("Helloa")); // false

    double[] values = new double[] { 0.2, 0.5, 1.9 };
    // add 0.1
    // [0.3, 0.6, 2.0]
    BigDecimal bd1 = BigDecimal.valueOf(0.1);
    for (int i = 0; i < values.length; i++) {
      // values[i] = (BigDecimal.valueOf(values[i]).add(bd1)).doubleValue();
      values[i] = BigDecimal.valueOf(values[i]) //
          .add(BigDecimal.valueOf(0.1)) //
          .doubleValue();
    }
    System.out.println(Arrays.toString(values));

    BigDecimal[] bigDecimals = new BigDecimal[3];
    bigDecimals[0] = BigDecimal.valueOf(10.3);
    bigDecimals[1] = BigDecimal.valueOf(2.4);
    bigDecimals[2] = BigDecimal.valueOf(9.9);
    System.out.println(Arrays.toString(bigDecimals)); // [0.1, 0.2, 0.3]

    float[] fArr = new float[bigDecimals.length];
    // for loop: bigDecimals -> fArr
    for (int i = 0; i < bigDecimals.length; i++) {
      fArr[i] = bigDecimals[i].floatValue();
    }
    System.out.println(Arrays.toString(fArr));

  }
}
