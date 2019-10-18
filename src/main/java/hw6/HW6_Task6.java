package hw6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Write a program that will enter numbers from the keyboard.
The code for reading numbers from the keyboard must be in the readData method.
The code inside the readData is wrapped in a try..catch.
If the user entered some text, instead of entering a number, the method should catch the exception and display all previously entered numbers as a result.
Numbers output from a new line preserving the order of input.
*/
public class HW6_Task6 {
    public static void main(String args[]) throws Exception {
        readData();
    }

    public static void readData() throws IOException {
        List<Integer> myLisOfInts = new ArrayList<>();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String number = "";
        try {
            while (true) {
                System.out.println("Enter some number:");
                myLisOfInts.add(Integer.parseInt(number = br.readLine()));
                System.out.println("data is: " + number);
            }
        } catch (IOException | NumberFormatException ex) {
            for (int i : myLisOfInts) {
                System.out.println(i);
            }
        } finally {
            br.close();
            r.close();
        }
    }
}