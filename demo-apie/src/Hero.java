import javax.management.relation.Role;

public class Hero {
   private Role role;

  public static Hero ofWarrior() {
    return new Hero(Role.WARRIOR);
  }

  public static Hero ofMage() {
    return new Hero(Role.MAGE);
  }

  public static Hero ofArcher() {
    return new Hero(Role.ARCHER);
  }

  private Hero(Role role) {
    this.role = role;
  }

  public static void main(String[] args) {
    Hero warrior = Hero.ofWarrior(); // new Hero
  }

}
