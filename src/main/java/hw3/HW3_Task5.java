package hw3;

/*
Write a function which calculates and returns the minimum of 4 arguments.
public static void main(String[] args) {
        // write your code here
}


public static int min(int a, int b, int c, int d) {

}
public static int min(int a, int b) {

}
 */
public class HW3_Task5 {
    public static void main(String[] args) {
        System.out.println(min(1, 2, -3, 6));
    }

    public static int min(int a, int b, int c, int d) {
        int[] myArray = {a, b, c, d};
        int minNumber = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            minNumber = min(minNumber, myArray[i]);
        }
        return minNumber;
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}