public class Encapsulation_BA {
   private double balance ; //

    public Encapsulation_BA(){
        balance=100.0; //

    }

    public Encapsulation_BA(double balance){
        this.balance=balance; //this means assigns it to current object

    }



    public void setBalance(double balance){
        this.balance=balance;
    }
    //it happens at industry like here we set some condition like String Password
   // and if the password is correct then do..
    //some logic then modifying depending on usecases allowing to modify

    public void printBalance(){
        System.out.println(balance);
    }

public double getBalance(){
        return balance;
}
//here also any random will not able to get it if someone is manager admin then some condition
    //someone who is outside the account not able to get it something like ..otherwise written no balance

    public  static void main(String [] args){
        Encapsulation_BA bk=new Encapsulation_BA();
        bk.printBalance();
        Encapsulation_BA accountPerson1=new Encapsulation_BA(200.0);
        accountPerson1.printBalance();

        Encapsulation_BA accountPerson2=new Encapsulation_BA(1000.0);

        accountPerson2.printBalance();


        accountPerson1.balance=0.0; //it will change directly if you want to change directly
        //entire code is not managed by single Team..there might be a section / which is maintained by other Team
        //and in the pipeline someone does this balance will be zero
        //foe this reason they dont allow to touch so we have Private ,concept of encapsulated
        //data is only encapsulated to current class
        //and how do we change it thats when getter and setter
        System.out.println(accountPerson1.balance); //balance is printed this is risky

        accountPerson1.setBalance(900); //here I  am setting the balance
        accountPerson1.printBalance();

//you cant directly change you have to communicate with methods
        //here in encapsulation where we do not allow direct modification, where we encapsulate everything
       // everything is private and can only be accessed by certain methods which has logic  written inside it
    }
}
