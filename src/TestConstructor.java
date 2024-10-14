public class TestConstructor {
    public TestConstructor() {
        System.out.println("Test constructor class");
    }

    public void printHello() {
        System.out.println("hello");
    }
}
    class BasicsTest{

        public static void main(String[] args){
            TestConstructor test=new TestConstructor(); //internally calls constructor
            test.printHello();
        }
        //see BankAccount Class to understand constructor
    }

