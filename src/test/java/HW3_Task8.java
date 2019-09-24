public class HW3_Task8 {
    public static void main(String[] args){
        char[][] myArray = new char[4][10];
        for(int i = 3; i >= 0; i--){
            for(int j = 9; j >= 0; j--){
                myArray[i][j] = '*';
                System.out.print(myArray[i][j]);
            }
            System.out.println(" ");
        }
    }
}
