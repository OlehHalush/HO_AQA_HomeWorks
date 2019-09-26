import java.lang.reflect.Array;
/*
Print numbers from 10 to 20 using all known cycles.
 */

public class HW3_Task1 {

    public static void main(String[] args) {
        System.out.println("Foreach loop");
        int[] intArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("For loop");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("While loop");
        int a = 10;
        while (a <= 20) {
            System.out.println(a);
            a++;
        }

        System.out.println("Do-while loop");
        int b = 10;
        do {
            System.out.println(b);
            b++;
        }
        while (b <= 20);
    }
}