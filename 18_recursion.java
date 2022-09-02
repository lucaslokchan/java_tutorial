//Recursion is the technique of making a function call itself
//Recursion 

public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}

//Halting condition
//The halting condition for this recursive function is when end is not greater than start
//Use recursion to add all of the numbers between 5 to 10.
public class Main {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    } 
}
