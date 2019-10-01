package hw5;

/*
Create an array of 15 random integers from the segment [0;   9].
Display the array on the screen.
Count how many in the array of even elements and display this number on the screen on a separate line.
*/
public class HW5_Task4 {
    public static void main(String[] args) {
        int[] myIntArray = new int[15];
        int evenNumbers = 0;
        for (int i = 0; i < 15; i++){
            myIntArray[i] = randomNumber();
            System.out.print(i < 14 ? myIntArray[i] + ", " : myIntArray[i]);
            if (myIntArray[i] % 2 == 0){
                evenNumbers++;
            }
        }
        System.out.println();
        System.out.println("Amount of event numbers in the array: " + evenNumbers);
    }

    public static int randomNumber() {
        return (int) (Math.random() * 10);
    }
}