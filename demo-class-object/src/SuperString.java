public class SuperString {
  private char[] chs;

  public String geString() {
    return String.valueOf(this.chs); // from char[] to String 
  }

  // You define your own way to store the String value
  public void setString(String str) {
    //this.chs = str.toCharArray();
    this.chs = new char[str.length()];
    for (int i= 0; i < str.length(); i++){
      this.chs[i] = str.charAt(i);
    }
  }

  public char charAt(int index) {
    return this.chs[index];
  }

   // this vs ss 
  public boolean equals(SuperString ss){
    if (this.chs.length != ss.geString().length()) {
      return false;
    }
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] != ss.geString().charAt(i)){
        return false;
      }
    }
    return true;
  }

  // try to write-> replace (char x, char y)

  public static void main(String[] args) {
    SuperString ss1 = new SuperString();
    ss1.setString("abc");
    System.out.println(ss1.charAt(0)); // a

    SuperString ss2 = new SuperString();
    ss2.setString("abcd");

    System.out.println(ss1.equals(ss2)); // false

    SuperString ss3 = new SuperString();
    ss3.setString("ade");
    System.out.println(ss1.equals(ss3)); // false

    SuperString ss4 = new SuperString();
    ss4.setString("abc");


  }
}
