package hw5;

import java.util.ArrayList;
import java.util.List;

/*
Create ArrayList of Strings. Add 5 different Strings to it.
Using any cycle print all the values of the ArrayList to the console.
1) Create ArrayList of String and initialize it.
2) The size of the ArrayList should be printed to the console.
3) All values should be printed to the console (each from a new line)
*/
public class HW5_Task5 {
    public static void main(String[] args) {
        List<String> myStringArrayList = new ArrayList<String>();
        myStringArrayList.add("First");
        myStringArrayList.add("Second");
        myStringArrayList.add("Third");
        myStringArrayList.add("Fourth");
        myStringArrayList.add("Fifth");
        System.out.println("The size of array is: " + myStringArrayList.size());
        for (String i : myStringArrayList) {
            System.out.println(i);
        }
    }
}