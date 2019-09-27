/*
Fill the array with numbers from 100 to 0.
 */
public class HW3_Task3 {
    public static void main(String[] args){
        int[] intArray = new int[101];
        int iterator = 0;
        for (int a = 100; a >= 0; a--){
            intArray[iterator] = a;
            System.out.println(intArray[iterator]);
            iterator++;
        }
    }
}
