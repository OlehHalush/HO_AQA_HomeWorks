public class HW3_Task3 {
    public static void main(String[] args){
        int[] intArray = new int[101];
        int b = 0;
        for (int a = 100; a >= 0; a--){
            intArray[b] = a;
            System.out.println(intArray[b]);
            b++;
        }
    }
}
