public class WeekDay2 {
  private String value; // "MON", "TUE", "WED", "THU", "FRI"

  public static WeekDay2 ofMonday() {
    return new WeekDay2("MON");
  }
  public static WeekDay2 ofTueday() {
    return new WeekDay2("TUE");
  }
  public static WeekDay2 ofWednesday() {
    return new WeekDay2("WED");
  }
  public static WeekDay2 ofThursday() {
    return new WeekDay2("THU");
  }
  public static WeekDay2 ofFriday() {
    return new WeekDay2("FRI");
  }

  private WeekDay2(String value) {
    this.value = value;
  }

  public String getDayName() {
    return this.value;
  }

  public static void main(String[] args) {
    WeekDay2 day1 = WeekDay2.ofMonday(); // readability

    WeekDay2 day2 = WeekDay2.ofThursday(); // readability
    System.out.println(day2.getDayName()); // THU

    // what is the problem of this design (without enum) ?
    WeekDay2 day3 = WeekDay2.ofMonday();
  }
}
