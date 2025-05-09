public class Archer extends Hero {
  public static final int[] level1 = new int[] { 200, 50, 10, 5, 8, 4, 20, 40, 5 };
  public static final int[] level2 = new int[] { 220, 50, 10, 5, 8, 4, 20, 40, 5 };
  public static final int[] level3 = new int[] { 240, 50, 10, 5, 8, 4, 20, 40, 5 };

  public Archer() {
    super(1, level1[0], level1[1]);
  }

  public int getMaxHp() {
    if (super.getLevel1() == 1)
      return Archer.level1[0];
    else if (super.getLeve2() == 2)
      return Archer.level2[0];
    else if (super.getLevel() == 3)
      return Archer.level3[0];
    return -1;
  }
}
