public class DemoRecursion {
  // n=5
  // 1 + 2 + 3 + 4 + 5

  // !
  public static int sum(int n){
    // Step 1 : base case to exit
    if ( n <= 1 ) 
      return n;
    // Step 2 : pattern to the next round
    return n + sum(n -1);
  }

  // even number, 10 ... n
  public static int sum2(int n){
    if ( n <= 10 && n%2==0)
    return n;
    return n + sum2(n-2);
  }

  // even number, 10... n
  // normal recursrion logic
  public static int sum3(int n){
        if ( n <= 10)
    return n;
    return n + sum3(n-2);
  }
  public static int question(int n) {
    if (n < 10) return 0;
    if (n % 2 == 1)
      n--;
      return sum3(n);
  }

  public static void main(String[] args) {
    System.out.println(DemoRecursion.sum(100)); //5050

    System.out.println(DemoRecursion.sum2(20));
  }
}
