public class HW3_Task4 {
    public static void main(String[] args){
        int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int result = intArray[1];
        for (int i = 2; i < intArray.length - 1; i++){
            result += intArray[i];
        }
        System.out.println(result);
    }
}
