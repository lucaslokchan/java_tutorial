//Define the variable type with square brackets
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};

//Access the elements of an array
cars[0]

//Change an array element
cars[1] = "Opel"

//Array length
cars.length;

//Loop through an array
for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
}

//With for each
for (String i : cars) {
  System.out.println(i);
}

//Multidimensional arrays
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2]; //Outputs 7

//Loop through a multidimensional array
public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}