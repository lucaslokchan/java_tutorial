//OOP is about creating objects that contain both data and methods
//"Don't Repeat Yourself" (DRY) principle
//Example: a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake

//Create a class
//To create a class, use the keyword class:
public class Main {
    int x = 5;
}

//Create an Object
//An object is created from a class
//To create an object of Main, specify the class name, followed by the object name, and use the keyword new
public class Main {
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}

//Multiple objects
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}