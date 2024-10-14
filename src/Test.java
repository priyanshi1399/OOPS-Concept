public class Test {
    public static void printTest(){
        System.out.println("Hello");
    }

    public static void main(String [] args) {

        Test.printTest(); //This can be access by className
        //if you remove static from above printTest() then it will give error in Test.printTest() then
        //that means you have to create the object of the class

        //See Example by removing static and then create object in main method
        Test test = new Test();
        test.printTest();

        //Now why do we need object???   Observe in Test1 class
    }

}
