/*
Write a program which prints the next figure to the console:
          *
         ***
        *****
       *******
      *********
     ***********
*/

public class HW3_Task11 {
    public static void main(String[] args) {
        int triangleHeight = 3;

        for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j < triangleHeight + i; j++) {
                //Write spaces before asterisks
                if (j <= triangleHeight - i) {
                    System.out.print(" ");
                }
                //Write asterisks
                if (j > triangleHeight - i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
