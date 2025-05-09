public class PersonalAccount extends Account{
  
  public PersonalAccount(){
    //super(); // implicitly calling Acount() constructor
  }


  public static void main(String[] args) {
    PersonalAccount pa = new PersonalAccount();
    pa.getSavingAccount();
    pa.getCurrentAccount();
    pa.balance();
  }
}
