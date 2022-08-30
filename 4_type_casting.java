//Widening Casting (Automatically) -> Smaller type to larger type size
//byte -> short -> char -> int -> long -> float -> double
public class Main {
    public static void main(String[] arg){
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt); //9
        System.out.println(myDouble); //9.0
    }
}

//Narrowing Casting (manually) -> Larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte
public class Main {
    public static void main(String[] arg) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); //9.78
        System.out.println(mtInt); //9
    }
}
