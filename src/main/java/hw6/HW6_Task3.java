package hw6;

/*
Finish the program to handle all the possible exceptions:
public class Main {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);
        int b = 10 / a;
        int[] c = {1};
        System.out.println(c[1]);
    }
}
Print the cause of the exception to the console.
*/
public class HW6_Task3 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println(a);

            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
        } catch (ArithmeticException ex) {
            System.out.println("This exception was caused by devisioning by 0.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("This exception was caused by the trying to get the value out of the array index boundary.");
        }
    }
}