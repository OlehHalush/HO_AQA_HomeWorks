public class HW3_Task9 {
    public static void main(String[] args){
        int asteriskQuantity = 10;
        char[][] myArray = new char[asteriskQuantity + 1][asteriskQuantity + 1];
        for(int i = 0; i < asteriskQuantity + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print(myArray[i][j] = '*');
            }
            System.out.println(" ");
        }
    }
}
