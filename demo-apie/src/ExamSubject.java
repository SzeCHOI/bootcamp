import java.util.Objects;

public class ExamSubject {
  // name (English, etc)
  private static int EXAM_CODE = 0;// across objects
  private long id;
  private Name name;
  // score
  private int score;

  public static ExamSubject ofEnglish() {
    return new ExamSubject(Name.ENGLISH, ++EXAM_CODE);
  }

  public static ExamSubject ofMath() {
    return new ExamSubject(Name.MATH);
  }

  public static ExamSubject ofHistory() {
    return new ExamSubject(Name.HISTORY);
  }

  // Constructor
  public ExamSubject(Name name, long id) {
    this.name = name;
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof ExamSubject))
      return false;
    ExamSubject examSubject = (ExamSubject) obj;
    return this.id == examSubject.getId();
  }

  // hashCode
  public int hashCode() {
    return Objects.hash(this.id);
  }

  // toString

  // getter, setter
  public long getId(){
    return this.id;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return this.name.name();
  }
  // equals(), toString, hasCode()

  public enum Name {
    HISTORY, ENGLISH, MATH;
  }

  public static void main(String[] args) {

  }

}