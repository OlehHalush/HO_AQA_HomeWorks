public class HW3_Task8 {
    public static void main(String[] args){
        int rows = 4;
        int columns = 10;
        for(int i = rows - 1; i >= 0; i--){
            for(int j = columns - 1; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}