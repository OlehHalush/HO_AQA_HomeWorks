package hw6;

/*
Fix the program to make it work:
public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
*/
public class HW6_Task4 {
    public static void main(String[] args) throws ArithmeticException {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}