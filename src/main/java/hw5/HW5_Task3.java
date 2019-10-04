package hw5;

import java.util.HashMap;
import java.util.Map;

/*
Create Map vehicles : vehicles.put("BMW", 5);, print
*/
public class HW5_Task3 {
    public static void main(String[] args) {
        Map vehicle = new HashMap();
        vehicle.put("BMW", 5);
        vehicle.put("Skoda", "A7");
        vehicle.put("Kia", "Sportage");
        System.out.println("BMW key is mapped to value \"" + vehicle.get("BMW") + "\"");
        System.out.println("Keys are: " + vehicle.keySet());
        System.out.println("Values are: " + vehicle.values());
    }
}