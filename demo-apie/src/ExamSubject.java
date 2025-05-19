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
    return new ExamSubject(Name.MATH, ++EXAM_CODE);
  }

  public static ExamSubject ofHistory() {
    return new ExamSubject(Name.HISTORY, ++EXAM_CODE);
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
  public long getId() {
    return this.id;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getName() {
    return this.name.name();
  }

    public int getScore() {
    return this.score;
  }
  // equals(), toString, hasCode()

  public enum Name {
    HISTORY, ENGLISH, MATH;
  }

  public static void main(String[] args) {
    ExamSubject es1 = ExamSubject.ofEnglish();
    System.out.println(es1.getName()); // "ENGLISH"
    es1.setScore(80);
    System.out.println(es1.getScore());

    System.out.println(es1); // ExamSubject(id=1,name=ENGLISH,score=80)
  }

}