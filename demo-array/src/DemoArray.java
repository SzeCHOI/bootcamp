public class DemoArray {
  public static void main(String[] args) {
    // assign int value 3 into int variable
    int x1 = 3;
    int x2 = 4;
    int x3 = -7;

    // array []
    // right hand side -> creating an array with size 3
    // left hadn side -> assign int array object to int array type (variable)
    int[] arr = new int[3]; // now, we got 3 boxes able to store 3 int values.

    // write
    // First box (index)
    arr[0] = 3;
    // second box
    arr[1] = 4;
    // third box
    arr[2] = -7;

    for (int i = 0; i < arr.length; i++) { // ! arr.length -> 3; 0, 1, 2
      System.out.println(arr[i]);
    }

    // Question: int array with size 5.
    // 10, 7, 4, -100, 6
    int[] box = new int[5];
    box[0] = 10;
    box[1] = 7;
    box[2] = 4;
    box[3] = -100;
    box[4] = 6;

    // Question: double array with size 4.
    // assign 4 double values into the array
    double[] d = new double[4];
    d[0] = 2.2;
    d[1] = 3.9;
    d[2] = 8.9;
    d[3] = 1.0;

    // read
    System.out.println(arr[0]); // 10.3
    System.out.println(d[3]); // 1.0

    double amount = 99.9;
    d[3] = amount; // assign double value into a double variable
    System.out.println(d[3]);

    // String array
    // size 3, with 3 String value

    String[] f = new String[4];
    f[0] = "f";
    f[1] = "f1";
    f[2] = "f2";
    f[3] = "f3";
    System.out.println(f[3]);

    // double array, for loop + sysout print out values
    for (int i = 0; i < d.length; i++) {
      System.out.println(d[i]);
    }

    for (int i = 0; i < f.length; i++) {
      System.out.println(f[i]);
    }

    double[] amounts = new double[6];
    amounts[0] = 10.9;
    amounts[3] = 14.1;
    amounts[5] = 99.9;
    for (int i = 0; i < amounts.length; i++) {
      System.out.println(amounts[i]);
    }

    // add 1.5 to all array values
    for (int i = 0; i < amounts.length; i++) {
      // amounts[i] = amounts[i] + 1.5;
      amounts[i] += 1.5;
      System.out.println(amounts[i]);
    }

    // for + if
    // print out those values > 100
    for (int i = 0; i < amounts.length; i++) {
      if (amounts[i] > 100) {
        System.out.println(amounts[i]);
      }
    }

    for (int i = 0; i < amounts.length; i++) {
      if (amounts[i] <= 100) {
        continue;
      }
      System.out.println(amounts[i]);
    }

    // int array
    // Find even number, and then print out "Age = x"
    int[] ages = new int[5];
    ages[0] = 26;
    ages[1] = 45;
    ages[2] = 69;
    ages[3] = 15;
    ages[4] = 10;
    for (int i = 0; i < ages.length; i++) {
      if (ages[i] % 2 == 0) {
        System.out.println("Age = " + ages[i]);
      }
    }

    // array + for + if
    // find the max value in the array
    int[] numbers = new int[6];
    numbers[0] = 40;
    numbers[1] = 68;
    numbers[2] = 90;
    numbers[3] = 13;
    numbers[4] = 22;
    numbers[5] = 77;
    int max = Integer.MIN_VALUE; // ! minimum value of int

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    System.out.println(max);

    // find min. value
    int[] salaries = new int[4];
    salaries[0] = 14000;
    salaries[1] = 19000;
    salaries[2] = 21000;
    salaries[3] = 34000;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < salaries.length; i++) {
      if (salaries[i] < min) {
        min = salaries[i];
      }
    }
    System.err.println("The least salary = $" + min);

    // John, Steven, Eric
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Steven";
    names[2] = "Eric";
    // Find the longest name in the array
    String longestName = ""; // empty String

    for (int i = 0; i < names.length; i++) {
      if (names[i].length() > longestName.length()) {
        longestName = names[i];
      }
    }
    System.err.println("Longest Name = " + longestName);

    int[] nums = new int[4];
    nums[0] = 9;
    nums[1] = 8;
    nums[2] = 7;
    nums[3] = 10;
    int even = 0;
    // Print out the first even number

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        even = nums[i];
        break; // exit for loop
      }
    }
    System.out.println("The first even number = " + even);

    char[] directions = new char[5];
    // l -> left
    // r -> right
    directions[0] = 'l';
    directions[1] = 'l';
    directions[2] = 'r';
    directions[3] = 'l';
    directions[4] = 'r';
    // l-> score +3
    // r-> score -2
    int score = 0;

    for (int i = 0; i < directions.length; i++) {
      if (directions[i] == 'l') {
        score += 3;
      }
      if (directions[i] == 'r') {
        score -= 2;
      }
    }
    System.out.println("Total score = " + score);

    // Swapping
    int w1 = 2;
    int w2 = 3;
    int backup = w1;
    w1 = w2;
    w2 = backup;
    System.out.println("w1 = " + w1);
    System.out.println("w2 = " + w2);

    int[] marksix = new int[6];
    marksix[0] = 5;
    marksix[1] = 20;
    marksix[2] = 47;
    marksix[3] = 43;
    marksix[4] = 39;
    marksix[5] = 2;
    // 5 20 47 43 39 2
    // ! i = 0, j = 0,1,2,3,4 (marksix [4+1] > marksix [4])
    // round 1: 5 vs 20 (20 > 5, no swap)
    // round 2: 20 vs 47 (47 > 20, no swap)
    // round 3: 47 vs 43 (43 < 47,swap) -> 5 20 43 47 39 3
    // round 4: 47 vs 39 (39 < 47,swap) -> 5 20 43 39 47 3
    // round 5: 47 vs 3 (3 < 47, swap) -> 5 20 43 39 3 47

    // ! i = 1
    // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 43 39 3 47
    // ...

    // Finally -> 2 5 20 39 43 47
    // ! Sorting (5 x 5)
    int temp = -1;
    for (int i = 0; i < marksix.length - 1; i++) { // i = 0
      for (int j = 0; j < marksix.length - i - 1; j++) { // j = 0,1,2,3,4 | j=0,1,2,3
        if (marksix[j + 1] < marksix[j]) {// swap
          temp = marksix[j + 1];
          marksix[j + 1] = marksix[j];
          marksix[j] = temp;
        }
      }
    }
    for (int i = 0; i < marksix.length; i++) {
      System.out.print(marksix[i] + " ");
    }
    System.out.println();

    // Counting
    int c = 0;
    char[] chs = new char[] { 'o', 'p', 'a', 'p' };
    // count the number of 'p'
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 'p') {
        c++;
      }
    }
    System.out.println(c);

    char[] chs2 = new char[] { 'o', 'p', 'a', 'p', 'o' };
    int[] counts = new int[26];
    counts[0] = 0;
    counts[1] = 0;
    counts[2] = 0; // 0-25
    // how many characters appear more then once
    // 2 -> 'o' 'p'
    for (int i = 0; i < chs2.length; i++) { // Can be written : int index = chs2[i] - 'a' ; counts[index]++;
      counts[chs2[i] - 'a']++;
    }
    int result = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 1) {
        result++;
      }
    }
    System.out.println(result); // 2

    // 0 9 1 9 2 0 9 9
    // is there any number appear 3 times or more?
    // true

    int[] num4 = new int[] { 0, 9, 1, 9, 2, 0, 9, 9 };
    int[] count4 = new int[10];
    for (int i = 0; i < num4.length; i++) {
      count4[num4[i]]++;
    }
    for (int i = 0; i < count4.length; i++) {
      if (count4[i] >= 3) {
        System.out.println("True");
        break;
      }
    }

    String[] lasNames = new String[] { "Lau", "Wong", "Chan" };
    // 8 primitives + String

  }
}
