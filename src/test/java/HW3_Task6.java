public class HW3_Task6 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(100));
    }

    public static int getEvenDigitSum(int a) {
        int result = 0;
        if (a < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = a; i >= 0; i--) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
