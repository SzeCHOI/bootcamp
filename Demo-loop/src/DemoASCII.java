public class DemoASCII {
  public static void main(String[] args) {

    // "" -> Strin value
    // '' -> char value
    char x = 'a';
    System.out.println(x); // c

    // char: 0 - 6xxxx
    // int: 2.1b
    int ascii = x;
    System.out.println(ascii); //97

    // b 98
    // z 122
    char k = '@';
    int y = k;
    System.out.println(y); // 64

    char u = '-';
    int p = u;
    System.out.println(p); // 45

    // given a-z, covert to 1-26
    char v = 'a';
    int t = v;
    t = v - 96;
    System.out.println(t);

    //model answer
    char w = 'z';
    int converted = w - 'a' + 1;
    System.out.println(converted); // 26

    

    // wrong
    int z = 'z';
    int ans = 0;
    for (int i = 0; i < z; i++) {
      ans = i - 'a' +1;
      System.out.println(ans);
      
    }


    // char (Math operation)
    // char - char -> int - int -> int
    System.out.println('b'- 'a'); // 1

    



  }
  
}
