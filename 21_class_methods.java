//Create a method named myMethod() in Main
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

//Static vs. Non-Static
//A static method means that it can be accessed without creating an object of the class
//A public method can only be accessed by objects
public class Main {
    //Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    //Main method
    public static void main(String[] args) {
        myStaticMethod(); //Call the static method
        //myPublicMethod(); this would compile an error

        Main myObj = new Main(); //Create an object of Main
        myObj.myPublicMethod(); //Call the public method on the object
    }
}

//Access methods with an object
//Create a main class
public class Main {

    //Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    //Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    //Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Main myCar = new Main(); //Create a myCar object
        myCar.fullThrottle(); //Call the fullThrottle() method
        myCar.speed(200); //Call the speed() method
    }
}

// The car is going as fast as it can!
// Max speed is: 200

//Using multiple classes