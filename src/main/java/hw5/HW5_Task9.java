package hw5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
Create HashSet<Integer> and add all unique numbers from the ArrayList.
*/
public class HW5_Task9 {
    public static void main(String[] args) {
        List<Integer> myListOfIntegers = new ArrayList<Integer>();
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        for (int i = 0; i < 100; i++) {
            myListOfIntegers.add((int) (Math.random() * 100));
            System.out.println(myListOfIntegers.get(i));
            myHashSet.add(myListOfIntegers.get(i));
        }

        System.out.println("List of numbers from HashSet:");
        for (int i : myHashSet) {
            System.out.println(i);
        }
    }
}