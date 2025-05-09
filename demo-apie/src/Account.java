// Account, SubAccount

// PersonalAccount & CommercialAccount
// Saving & Current

import java.math.BigDecimal;

public abstract class Account {
  private double balance;
  private SubAccount[] subAccounts; // saving, stock, foriegn exchange

  // super()
  public Account(){
    this.subAccounts = new SubAccount[1];
    this.subAccounts[0] = new SavingAccount(); // ! New Concept
    this.subAccounts[1] = new CurrentAccount();
  }

  public double getBalance(){
    return this.balance;
  }

  public SubAccount getSavingAccount() {
    return this.subAccounts[0];
  }

  public SubAccount getCurrentAccount(){
    return this.subAccounts[1];
  }

  public double balance() {
    // loop SubAccounts to sum up balance
    BigDecimal bd = new BigDecimal(0.0);
    for (int i = 0; i< subAccounts.length; i++) {
      bd = bd.add(BigDecimal.valueOf(this.subAccounts[i].getBalance()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    // Polymorphism
    Animal animal = new Cat("John", 12);
    animal = new Dog("Susan"); // Dog is a child class of Animal class
    // Cat dog = new Dog("Peter"); // NOT OK
    // Cat cat = new Animal ("Peter"); // NOT OK
    Cat cat = new Cat("Jenny", 10);

    // Parent Class Array
    Animal[] animals = new Animal[] {new Cat("John", 12), new Dog("Peter")};

  }
}
