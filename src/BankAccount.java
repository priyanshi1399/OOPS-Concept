public class BankAccount {
    double balance ; //if I dont assign then it takes garbage value
    String accountType;
    public BankAccount(){
        balance=100.0; //if I open bank account  then it assign me 100

    }

    public BankAccount(double balance){
        this.balance=balance; //this meands assigns it to current object
        accountType="Savings";
    }

    public BankAccount(double _balance,String _accountType){
        balance=_balance;
        accountType=_accountType;

    }

    public void printBalance(){
        System.out.println(balance);
    }

    public void printAccountType(){
        System.out.println(accountType);
    }

    public  static void main(String [] args){
        BankAccount bk=new BankAccount();
        bk.printBalance();
//o/p-->100 , default constructor in case you need it//
        //we decide how much to give that is paramterized constructor

        //there are different brances every branch gives diff balance that when we use parameterized constructor

        BankAccount bk1=new BankAccount(100); //people can add it by their own way
        BankAccount bk2=new BankAccount(200.0);
        bk2.printBalance();
        bk2.printAccountType(); //by default Savings

        BankAccount accountPerson2=new BankAccount(1000.0,"current");
        accountPerson2.printAccountType();
        accountPerson2.printBalance();

    }
}

