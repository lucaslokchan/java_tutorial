//Create a method
//myMethod is the name of the method
//static means that the method belongs to the main class and not an object of the main class
//void means that this method does not have a return value

public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    //Call a method
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
