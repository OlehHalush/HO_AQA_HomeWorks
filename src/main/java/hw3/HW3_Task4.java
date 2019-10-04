package hw3;

/*
Given an array of 10 integers. To display the sum of all its elements except the first and last.
 */
public class HW3_Task4 {
    public static void main(String[] args){
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int result = 0;
        for (int i = 1; i < intArray.length - 1; i++){
            result += intArray[i];
        }
        System.out.println(result);
    }
}