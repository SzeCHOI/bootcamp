public class DemoForLoop {
    public static void main(String[] args) {
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println(x); // 16

        int a = 2;
        for (int i = 0; i < 3; i++) {
            a *= 2;
        }
        System.out.println(a);

        // base = ?, + 8 (10 times)

        int num1 = 9;
        int num2 = 17;
        int max = 0;

        if (num1 > num2) {
            num1 = max;
        } else {
            max = num2;
        }
        System.out.println(max);

        // 0 - 100, Find the largest odd number, which is < 90
        int b = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1 && i < 90) {
                b = i;
            }
        }
        System.out.println(b);

        // model answer
        int maxOdd = -1;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1 && i < 90 && i > maxOdd) {
                maxOdd = i;
            }
        }
        System.out.println(maxOdd); // 89

        // 0-20, sum up all even numbers
        // 0 + 2 + 4... + 20
        int sumEven = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println(sumEven);

        // 0 - 30, if < 20, sum up odd numbers, if >= 20, sum up even numbers
        // result

        int result = 0;
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 1 && i < 20) {
                result += i;
            }
            if (i >= 20 && i % 2 == 0) {
                result += i;
            }
        }
        System.out.println(result);

        // model answer
        int box = 0;
        for (int i = 0; i < 31; i++) {
            if (i < 20) {
                if (i % 2 == 1) {
                    box += i;
                }
            } else {
                if (i % 2 == 0) {
                    box += i;
                }
            }
        }
        System.out.println(box);

        // Searching
        String s1 = "welcome to bootcamp.";
        // 1. Find the number of 'o'
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'o') {
                ++count;
            }
        }
        System.out.println("Number of 'o' is " + count);

        // Approach 1: simple if
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // ! for + continue
        // Approach 2: continue
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 1) {
                continue; // skip the rest of code, goes to i++
            }
            if (i > 100) {
                continue;
            }
            System.out.println(i); // 0, 2
        }

        // ! for + break
        // Approach 1: simple if
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.println(i); // 0, 1
            }
        }

        // Approach 2: break
        for (int i = 0; i < 3; i++) {
            if (i >= 2) {
                break; // skip the rest of code, goes to i++
            }
            System.out.println(i); // 0, 1
        }

        // Question : sum up 5 - 15 -> result
        // the product of 16 - 20 -> result2
        // single for loop

        int ans1 = 0;
        int ans2 = 1;

        for (int i = 0; i < 21; i++) {
            if (i >= 5 && i <= 15) {
                ans1 += i;
                continue;
            }
            if  (i >= 16 && i <= 20) {
                ans2 *= i;
            }
        }
        System.out.println(ans1);
        System.out.println(ans2);

        for (int i = 10; i >= 0 ; i--){
            System.out.println(i);
        }

        // ! Nested Loop
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                System.out.println("i=" +i + ",j" + j);
            }
        }


    }
}
