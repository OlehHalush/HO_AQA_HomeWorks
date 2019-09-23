import java.lang.reflect.Array;

public class HW3_Task1 {

    public static void main(String[] args){
        System.out.println("Foreach loop");
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        for (int i: intArray){
            System.out.println(i);
        }

        System.out.println("For loop");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("While loop");
        int a = 0;
        while (a <= 10){
            System.out.println(a);
            a++;
        }

        System.out.println("Do-while loop");
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }
        while (b <= 10);
    }
}
