/*
Write a method named getEvenDigitSum with one parameter of the type "int".
The method should return the sum of even digits within the number.
If the number is negative, method should return -1;
 */

public class HW3_Task6 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1001));
    }

    public static int getEvenDigitSum(int a) {
        int sum = 0;
        while(a > 0 ){
            int digit = a % 10;
            a = a / 10;
            sum += digit;
        }
        return sum;
    }
}