//Base Class
class Vehicle{
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle=numberOfVehicle;
    }
    public void honk(){
        System.out.println("honk!!!!!!!!!!");
    }

    public void printNumberOfVehicle () {
        System.out.println(numberOfVehicle);
    }
        }

//derived class
class Car_inheritence extends Vehicle{
    private String numberOfCar;


/*    public Car_inheritence(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }*/

    public Car_inheritence(String numberOfCar) {
        super(numberOfCar); //it will work after vehicle class// to access base class super is used
    }

    public void printCarNumber() {
        System.out.println(numberOfCar);
    }

    /* removing it after making Vehicle class
    public void honk(){
        System.out.println("Honk!!!!!!!!!!!!!!!!!!!!!");
    }*/
}

class Bus_inheritence extends Vehicle {
    private String numberOfBus;

    /*public Bus_inheritence(String numberOfBus) {
        this.numberOfBus = numberOfBus;
    }*/

    public Bus_inheritence(String numberOfBus) {
        super(numberOfBus); //to access base class property
        }

    public void printBusNumber () {
        System.out.println(numberOfBus);
    }

    /* removing it after making Vehicle class
    public void honk(){
        System.out.println("Honk!!!!!!!!!!!!!!!!!!!!!");
    }*/
}

class Basics2{
    public static  void main(String [] args) {
        Car_inheritence car = new Car_inheritence("KA5678654");
        //car.printCarNumber();
        car.printNumberOfVehicle();
        car.honk(); //after vehicle super uses

        Bus_inheritence bus=new Bus_inheritence("KA56355389");
       // bus.printBusNumber();
        bus.printNumberOfVehicle(); //After super() property used
        bus.honk();

    }
    }

//I want the Car to honk then make the method.pressing honk but dont know what happens inside but press honk
//but here honk is doing similar function same implementation of honk
//so for that we will have a class Vehicle
//inheritence --use the functionality of Vehicle
//Car extends vehicle-->car is going to inherit the property same as Bus extens Vehicle
//Similarly numberofvehicle is same this can be reused
//this is inheritence where you have base class and derived class