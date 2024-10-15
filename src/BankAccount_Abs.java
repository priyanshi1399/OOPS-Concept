public abstract class BankAccount_Abs {
  //this tells what will be done but not how
  double balance;
  public abstract void addMoney(double amount);

  abstract void canUserwithdrawMoney(double amount); //again we dont know how to withdraw
    //bank account we know that we can withdraw add balance but dont know how ..

    void updatebalance(double _balance){
        balance=_balance; //its not like that the abstract method dont allow any implemented method
       // this we have but it can not use this updatebalance method only my derived classes who are extending can use it
    }

    public double getBalance(){
        return balance;
    }
}


/*
class savingAccount extends BankAccount_Abs{
    //by this we will have error we can not create  object of saving account but we want to create object
}*/

class SavingAccount extends BankAccount_Abs{
    public void addMoney(double amount){
        super.updatebalance(super.getBalance()+amount); //getting curent amount +amount //need to update it and simply pass on it.
    }
//this is abstract
    public void canUserwithdrawMoney(double amount){
    if(amount<=super.getBalance()){
        System.out.println("user can");
    }
    else{
        System.out.println("User can't");
    }
    }


    //Now error gone because we are implementing that method of abstract
}

class CurrentAccount extends BankAccount_Abs{
    double minimumLimit=1000.0;
    public void addMoney(double amount){
        super.updatebalance(super.getBalance()+amount);
    }
    public void canUserwithdrawMoney(double amount){
        //in saving suppose  we have to keep 0 balance most of time
        //but in current you ahve minimum limit
        //but here we need to check other logic
        if(super.getBalance()-amount>=minimumLimit){
            System.out.println("user can");
        }
        else{
            System.out.println("user can't"); //but what to observe that implementation can be different
        }
    }
}

class basics4{
    public static void main(String [] args){
       // BankAccount_Abs ba=new BankAccount_Abs(); //we can't create object of Abstract
    }
}
