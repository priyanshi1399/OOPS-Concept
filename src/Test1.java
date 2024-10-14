public class Test1 {

    int age;
    public void assignAge(int num){
        age=num;
    }
}
class Basics1{

    public static void main(String [] args){
        Test1 test1=new Test1();
        test1.assignAge(10);

        Test1 test2=new Test1();
        test2.assignAge(19);

        System.out.println(test1.age); //it should be 19 but still printing 10 and then print second object
        System.out.println(test2.age); //gives 19

        //o/p-10 19
        //we created instances of class, we created 2 instances ..
        //any work done on 1 instance dosen't effect the other instance thats why we need object.
        //you have certain  set of code  which can be done by anyone so dosent impact anyone.

        //Real life example design of a Model
        // copy the design and sell it to other ,create an instance and you can do anything with it , so this is object.
    }
}
