public class Candidate {
  private ExamSubject[] examSubjects;

  public Candidate() {
    this.examSubjects = new ExamSubject[] { ExamSubject.ofEnglish(),
        ExamSubject.ofHistory(), ExamSubject.ofMath() };
  }

  public void attendEnglishExam() {
    this.examSubjects[0] = ExamSubject.ofEnglish();
  }

  public void attendMathExam() {
    this.examSubjects[0] = ExamSubject.ofMath();
  }

  public void attendHistoryExam() {
    this.examSubjects[1] = ExamSubject.ofHistory();
  }

  public ExamSubject getEnglishSubject(){
return this.examSubjects[0];
  }

  public int getEnglishScore() {
    if (this.examSubjects[0] != null) {
      return this.examSubjects[0].getScore();
    } else {
      System.out.println("The candidate didn't attend the exam");
      return -1;
    }
  }

  public int getHistoryScore() {
    return this.examSubjects[1].getScore();
  }

  public int getMathScore() {
    return this.examSubjects[2].getScore();
  }

  public void setEnglish(int score){
      this.examSubjects[0].setScore(score);
}

  public void setHistory(int score){
    this.examSubjects[1].setScore(score);
  }

  public void setMath(int score){
    this.examSubjects[2].setScore(score);
  }

  public static void main(String[] args) {
    Candidate canA = new Candidate();
    canA.setEnglish(80);
    canA.setHistory(45);
    canA.setMath(90);

    Candidate canB = new Candidate();
    canB.setEnglish(100);
    canB.setMath(90);
    canB.setHistory(40);

    System.out.println(canA.getHistoryScore()); // 45
    System.out.println(canB.getHistoryScore()); // 40

    System.out.println(canA.getEnglishSubject().equals(canB.getEnglishSubject())); // false
    System.out.println(canA.getEnglishSubject().equals(canA.getEnglishSubject())); // true

    System.out.println(canA.getEnglishSubject().getId()); // 1
    System.out.println(canB.getEnglishSubject().getId()); // 4
  }
}
