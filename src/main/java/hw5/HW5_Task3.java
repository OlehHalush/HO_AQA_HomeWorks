package hw5;

import java.util.HashMap;
import java.util.Map;

/*
Create Map vehicles : vehicles.put("BMW", 5);, print
*/
public class HW5_Task3 {
    public static void main(String[] args) {
        Map Vehicle = new HashMap();
        Vehicle.put("BMW", 5);
        Vehicle.put("Skoda", "A7");
        Vehicle.put("Kia", "Sportage");
        System.out.println("BMW key is mapped to value \"" + Vehicle.get("BMW") + "\"");
        System.out.println("Keys are: " + Vehicle.keySet());
        System.out.println("Values are: " + Vehicle.values());
    }
}