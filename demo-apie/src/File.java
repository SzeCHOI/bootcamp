// ! Interface
// APIE -> "A" -> Abstraction
// Classs Signature
public class File implements Readable, Writable{ // functions, skills
  // ! implements "interface"
  private String content;

  public File(String content) {
    this.content = content;
  }

  private void append (String newContent){
    this.content += newContent;
  }

  public String getContent(){
    return this.content;
  }

  // Compile-time
  // Once you "@Override", Java checks if the parent class/ interface has this method
  // if exists, this child class override the parent/ interface
  @Override
  public String read() {
    // System.out.println("I am reading the file ..." + this.content);
    return this.content;
  }

  // Method Signature: method name + input parameters
  @Override
  public void write(String content){
    this.append(content);
  }

  public static void main(String[] args) {
    File file = new File("Hello world");
    file.append("!!!");
    System.out.println(file.getContent());
  }
}
