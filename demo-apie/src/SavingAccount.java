public class SavingAccount extends SubAccount {
  private Currency currency;

  //
  public static SavingAccount ofHKD(){
    return new SavingAccount(Currency.HKD);
  }

  public SavingAccount(Currency currency) {
    this.currency = currency;
  }

  public static void main(String[] args) {
    SavingAccount sa = new SavingAccount(Currency.USD);
    System.out.println(sa.getBalance());// 0.0
    sa.credit(150);
    System.out.println(sa.debit(100)); // true
    System.out.println(sa.getBalance()); // 50
    System.out.println(sa.debit(60)); // false
    System.out.println(sa.getBalance()); // 50

    CurrentAccount ca = new CurrentAccount();
    ca.credit(200);
    ca.debit(110);
    System.out.println(ca.getBalance()); // 90.0

    PersonalAccount pa = new PersonalAccount();
    // add $100 to saving account
    // add $500 to current account
    // deduct $80 from saving account
    // deduct $230 from current account
    // print out the balance of this personal account.

    pa.getSavingAccount().credit(100);
    pa.getCurrentAccount().credit(500);
    pa.getSavingAccount().debit(80);
    pa.getCurrentAccount().debit(230);
    System.out.println(pa.getSavingAccount().getBalance()); // 20.0
    System.out.println(pa.getCurrentAccount().getBalance()); // 270.0
    System.out.println(pa.balance()); // 290.0
  }
}
