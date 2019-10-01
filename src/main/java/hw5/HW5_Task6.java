package hw5;

import java.util.ArrayList;
import java.util.List;

/*
Create ArrayList of Strings. Add 10 different Strings to it.
Using any cycle find the longest String in the list and print it out.
If there are several String with the same length - print each from a new line.
1) Create ArrayList of String and initialize it.
2) All values with the highest length should be printed out."
*/
public class HW5_Task6 {
    public static void main(String[] args) {
        List<String> myArraList = new ArrayList<String>();
        myArraList.add("String 1");
        myArraList.add("String 2");
        myArraList.add("String 3");
        myArraList.add("String 4");
        myArraList.add("String 5");
        myArraList.add("String 6");
        myArraList.add("String 7");
        myArraList.add("String 8");
        myArraList.add("String 9");
        myArraList.add("String 10");

        int longestString = 0;
        List<String> arrayOfLongestStrings = new ArrayList<String>();
        //Defining the longest string
        for (String i : myArraList){
            if (i.length() > longestString){
                longestString = i.length();
            }
        }
        //Printing the longest strings
        for (String i : myArraList){
            if (i.length() == longestString){
                arrayOfLongestStrings.add(i);
                System.out.println(i);
            }
        }
    }
}
