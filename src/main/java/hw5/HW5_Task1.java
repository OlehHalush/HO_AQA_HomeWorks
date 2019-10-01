package hw5;

import java.util.ArrayList;

/*
Create ArrayList and print it.
*/
public class HW5_Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> myIntArrayList = new ArrayList();
        myIntArrayList.add(1);
        myIntArrayList.add(5);
        myIntArrayList.add(10);

        for (int i : myIntArrayList) {
            System.out.println(i);
        }
    }
}
