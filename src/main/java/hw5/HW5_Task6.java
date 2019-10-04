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
        List<String> myStringArraList = new ArrayList<String>();
        myStringArraList.add("String 1");
        myStringArraList.add("String 2");
        myStringArraList.add("String 3");
        myStringArraList.add("String 4");
        myStringArraList.add("String 5");
        myStringArraList.add("String 6");
        myStringArraList.add("String 7");
        myStringArraList.add("String 8");
        myStringArraList.add("String 9");
        myStringArraList.add("String 10");

        int longestString = 0;
        List<String> arrayOfLongestStrings = new ArrayList<String>();
        //Defining the longest string
        for (String i : myStringArraList){
            if (i.length() > longestString){
                longestString = i.length();
            }
        }
        //Printing the longest strings
        for (String i : myStringArraList){
            if (i.length() == longestString){
                arrayOfLongestStrings.add(i);
                System.out.println(i);
            }
        }
    }
}