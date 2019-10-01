package hw3;

/*
Write a program which prints the next figure to the console:
*
**
***
****
*****
******
*******
*/
public class HW3_Task9 {
    public static void main(String[] args){
        int height = 10;
        for(int i = 0; i <= height; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
