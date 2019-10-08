package hw6.task1;

/*
Create method to check: if number < 0 print “Number < 0”, if number > 0 print “Number > 0” if number = 0 throw your own exception
*/
public class HW6_Task1 {
    public static void main(String[] args) throws ZeroNumberException {
        checkNumber(0);
    }

    private static void checkNumber(int number) throws ZeroNumberException {
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        } else {
            throw new ZeroNumberException();
        }
    }
}