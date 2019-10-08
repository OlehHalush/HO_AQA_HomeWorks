package hw6;

/*
Throw a NullPointerException from the method iCanThrowException();
Handle it in the main method.
public class Main {
    public static void main(String[] args) {
        iCanThrowException();
    }
    public static void iCanThrowException() {
    }
}
*/
public class HW6_Task5 {
    public static void main(String[] args) {
        try {
            iCanThrowException();
        } catch (NullPointerException ex) {
            System.out.println("This exception is caused by referencing on null value.");
        }
    }

    public static void iCanThrowException() throws NullPointerException {
        throw new NullPointerException();
    }
}