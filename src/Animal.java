public interface Animal {
    //by default it is abstract method if you dont write as well
    void bark();
   default  void sleep(){
        System.out.println("sleeping"); //this is default implementatoion
    }


//If I remove default then I can put static then can access
    //if I made static method then I can access it by classname.
    //check in basics Interface Main class
}




class Dog implements Animal,Pet{
    public void bark(){
        System.out.println("Bark!!!!");
    }

    @Override //if I remove it also then also no problem beacuse already its implementation is there
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    public void ownerName(){ //implementing its method
        System.out.println("xyzz");
    }
}
//see in main Basics_Interface

class Cat implements Animal{
    public void bark(){
        System.out.println("Meowww!!!!");
    }

  //here the thing is if we are not implementing the sleep method then default one will run
    //check object of cat in main Basics_Interface
}