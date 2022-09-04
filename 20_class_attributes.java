//Create a class called "Main" with two attributes: x and y
public class Main {
    int x = 5; //Attribute
    int y = 3; //Attribute
}

//Accessing attribute
public class Main {
    int x = 5;

    public static void main(String[] arg) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}

//Modify attribute
public class Main {
    int x = 5;

    public static void main(String[] arg){
        Main myObj = new Main();
        myObj.x = 40;
        System.out.println(myObj.x);
    }
}