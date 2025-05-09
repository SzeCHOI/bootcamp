public class Hero {
  private int hp;
  private int leval;
  private int mp;

  public Hero(int level, int hp, int mp){
    this.level = level;
    this.hp = hp;
    this.mp = mp;
  }

  private long id;
  private long hp;

  public Hero() {
    this.id = ++counter;

  }

}
