package HW3;

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
        int triangleHeight = 5;
        //Solution 1
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
        //Solution 2
//        for (int i = 1; i <= triangleHeight; i++) {
//                int asterisks = i * 2 - 1;
//                int beginSpaces = (triangleHeight * 2 - 1 - asterisks) / 2;
//                int endSpaces = (triangleHeight * 2 - 1 - asterisks) / 2;
//                while(beginSpaces > 0){
//                    System.out.print(" ");
//                    beginSpaces--;
//                }
//                while(asterisks > 0){
//                    System.out.print("*");
//                    asterisks--;
//                }
//                while(endSpaces > 0){
//                    System.out.print(" ");
//                    endSpaces--;
//                }
//                System.out.println();
//        }
    }
}
