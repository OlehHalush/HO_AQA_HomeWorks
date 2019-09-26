/*
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of two numbers.
*/
public class HW3_Task7 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(100, 50));
    }

    private static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }
        int divisor = 0;
        int startNumber = a > b ? a : b;
        for (int i = startNumber; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }
}
