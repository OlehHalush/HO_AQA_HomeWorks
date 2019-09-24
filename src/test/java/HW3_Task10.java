/*
Write a program which prints the next figure to the console:
**********
*           *
*           *
*           *
**********
 */
public class HW3_Task10 {
    public static void main(String[] args){
        int rows = 5;
        int columns = 13;
        char[][] myArray = new char[rows + 1][columns];
        //Printing first and last rows
        int firstAndLastRowsAsterisks = 10;
        for (int i = 0; i < rows; i++){
            if(i == 0 || i == rows - 1){
                for(int j = 0; j < firstAndLastRowsAsterisks; j++) {
                    System.out.print(myArray[i][j] = '*');
                }
                System.out.println("");
            } else {
                //Printing rows in the middle
                for (int j = 0; j < columns; j++){
                    if (j == 0) {
                        System.out.print(myArray[i][j] = '*');
                    } else if (j == columns - 1) {
                        System.out.print(myArray[i][j] = '*');
                        System.out.println(" ");
                    } else {
                        System.out.print(myArray[i][j] = 32);
                    }
                }
            }
        }
    }
}

