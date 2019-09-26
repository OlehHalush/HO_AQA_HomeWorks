/*
Print all the numbers from 1 to 100, which are divided by 3 without a remainder.
*/
public class HW3_Task2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
