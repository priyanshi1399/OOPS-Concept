class Vehicle1{
    String numberOfVehicle;

    public Vehicle1(String numberOfVehicle1){
        this.numberOfVehicle=numberOfVehicle1;
    }
    public void honk(){
        System.out.println("honk!!!!!!!!!!");
    }

    public void printNumberOfVehicle () {
        System.out.println(numberOfVehicle);
    }
}


    //derived class
    class Car_PolyMorphism extends Vehicle1 {
      //  private String numberOfCar;


        public Car_PolyMorphism(String numberOfCar) {
            super(numberOfCar); //it will work after Vehicle1 class// to access base class super is used
        }

        @Override
        public void honk() {
            System.out.println("Give me a way!!!!!!!!!!!");
        }
    }

    class Bus_PolyMorphism extends Vehicle1 {
        //private String numberOfBus;


        public Bus_PolyMorphism(String numberOfBus) {
            super(numberOfBus); //to access base class property
        }

    }

    class Basics3{
        public static  void main(String [] args) {
            Car_PolyMorphism car = new Car_PolyMorphism("KA5678654");
            car.printNumberOfVehicle();
            car.honk(); //after Vehicle1 super uses

            Bus_PolyMorphism bus=new Bus_PolyMorphism("KA56355389");
            bus.printNumberOfVehicle();
            bus.honk();

            Vehicle vh=new Vehicle("KA67557"); //can create object for Vehicle also
        }
    }


    //you want to change the honk , so we will override
//only a certain thing want to modify the different
//when we override the functionality at the same time we use some functionality
//beacuse if we override all there is no point of extending the Vehicle class
